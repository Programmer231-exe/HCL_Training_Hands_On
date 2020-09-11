package com.exceptiondemo.case2;

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
				System.out.println("Result : " + (int)number[i]/divisor);
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
