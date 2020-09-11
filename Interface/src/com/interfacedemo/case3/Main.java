package com.interfacedemo.case3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] className = {"Rajmachi","Shivgadh","Murud"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Where you want to visit" +
							"\n1. Rajmachi" +
							"\n2.Shivgadh" +
							"\n3.Murud");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			callObject(className[0]);
		}else if(choice == 2) {
			callObject(className[1]);
		}else if(choice == 3) {
			callObject(className[2]);
		}
		scanner.close();
	}
	
	private static void callObject(String className) {
		Fort fort = null;
		
		try {
			fort = (Fort)Class.forName("com.interfacedemo.case3."+className).newInstance();
			fort.distance();
		}catch(ClassNotFoundException cnfe) {
			System.err.println("Class Name is not Valid");
		}catch(Exception e) {
			System.err.println("Error occurs");
		}
		
	}
}
