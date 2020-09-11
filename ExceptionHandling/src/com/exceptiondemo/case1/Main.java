package com.exceptiondemo.case1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any ten values");
		for(int i = 0; i < 10 ; i++) {
			number[i] = scanner.nextInt();
		}
		VickyNumberGame.divide(number);
		scanner.close();
		
	}
}
