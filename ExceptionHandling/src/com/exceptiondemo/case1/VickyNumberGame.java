package com.exceptiondemo.case1;

public class VickyNumberGame {
	private int number[];
	
	
	
	public int[] getNumber() {
		return number;
	}



	public void setNumber(int[] number) {
		this.number = number;
	}



	public static void divide(int[] number) {
		int i = 0;
		int denominator = 10;
		while(true) {
			try {
				System.out.println("Result : " + (int)number[i]/denominator);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Elemnts Over");
				break;
			}
			
			denominator--;
			i++;
		}
	}

}
