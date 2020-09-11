package com.interfacedemo.case2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		double length;
		double breadth;
		double side;
		Polygon polygon = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Breadth and Length");
		length = scanner.nextDouble();
		breadth = scanner.nextDouble();
		System.out.println("Enter the Side of the Square");
		side = scanner.nextDouble();
		polygon = new Rectangle(length,breadth);
		displayDetails(polygon);
		polygon = new Square(side);
		displayDetails(polygon);
		scanner.close();
	}
	
	private static void displayDetails(Polygon p) {
		System.out.println("Perimeter of " + p.getClass().getName().substring(24) + " : " + p.calcPeri());
		System.out.println("Area of " + p.getClass().getName().substring(24) + ": " + p.calcArea());
	}

}
