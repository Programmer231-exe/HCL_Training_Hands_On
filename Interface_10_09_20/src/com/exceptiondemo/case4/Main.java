package com.exceptiondemo.case4;

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
		}catch(IllegalArgumentException e) {
			System.out.println("Result : 0");
			System.out.println("Excception handled in the main() method");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Elemnts Over");
		}catch(ArithmeticException e) {
			System.err.println("Play Fair,0 is not accepted");
			
		}
		
		scanner.close();
		
	}
}
