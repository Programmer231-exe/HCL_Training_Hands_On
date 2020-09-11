package com.exceptiondemo.case5;

public class VickyNumberGame {
	private int number[];
	
	
	
	public int[] getNumber() {
		return number;
	}



	public void setNumber(int[] number) {
		this.number = number;
	}



	public static void divide(int[] number,int divisor) throws Exception{
		int i = 0;
		while(true) {
			if((number[i] % 2 == 0 && divisor%2 == 0) | (number[i] % 2 != 0 && divisor%2 != 0) )
				System.out.println("Result : " + number[i]/divisor);
			else 
				throw new WrongComboException("Invalid Combination : " + number[i] + " " +divisor);
			
			
			i++;
		}
	}

}
