package com.hcltrainings.arithmeticexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		int costOfTheItem;
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter the Cost of th item for a day");
			costOfTheItem = Integer.parseInt(br.readLine());
			System.out.println("Enter the value of n");
			n = Integer.parseInt(br.readLine());
			System.out.println("Cost per day of the item is " + (costOfTheItem/n));
		}catch(IOException ioe){
			System.err.println("IO Error");
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
		
	}
}
