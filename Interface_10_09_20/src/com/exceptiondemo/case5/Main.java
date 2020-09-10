package com.exceptiondemo.case5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number[] = new int[10];
		int divisor;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any ten values");
		for(int i = 0; i < 10 ; i++) {
			number[i] = scanner.nextInt();
		}
		System.out.println("Enter the divisor: ");
		divisor = scanner.nextInt();
		
		try {
			VickyNumberGame.divide(number,divisor);
		}catch(WrongComboException wce) {
			System.out.println("Result : 0");
			System.out.println(wce.getMessage());
		}catch(ArrayIndexOutOfBoundsException aoe) {
			System.out.println("Elemnts Over");
		}catch(ArithmeticException ae) {
			System.err.println("Play Fair,0 is not accepted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		scanner.close();
		
	}
}
