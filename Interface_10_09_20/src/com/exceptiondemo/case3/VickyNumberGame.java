package com.exceptiondemo.case3;

public class VickyNumberGame {
	private int number[];
	
	
	
	public int[] getNumber() {
		return number;
	}



	public void setNumber(int[] number) {
		this.number = number;
	}



	public static void divide(int[] number,int divisor) {
		int i = 0;
		while(true) {
			try {
				if((number[i] % 2 == 0 && divisor%2 == 0) | (number[i] % 2 != 0 && divisor%2 != 0) )
					System.out.println("Result : " + number[i]/divisor);
				else 
					throw new IllegalArgumentException();
			}catch(IllegalArgumentException e) {
				System.out.println("Result : 0");
				System.out.println("Excception handled in the method");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Elemnts Over");
				break;
			}catch(ArithmeticException e) {
				System.err.println("Play Fair,0 is not accepted");
				break;
			}
			
			i++;
		}
	}

}
