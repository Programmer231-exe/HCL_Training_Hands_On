package com.exceptiondemo.case3;

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
		VickyNumberGame.divide(number,divisor);
		scanner.close();
		
	}
}
