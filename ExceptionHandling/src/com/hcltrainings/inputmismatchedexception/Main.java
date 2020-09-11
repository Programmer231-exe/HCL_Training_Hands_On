package com.hcltrainings.inputmismatchedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the integer input");
		try {
			count = scanner.nextInt();
			System.out.println("Entered Value is " + count);
		}catch(InputMismatchException ime) {
			System.out.println(ime.toString());
		}
		scanner.close();
	}

}
