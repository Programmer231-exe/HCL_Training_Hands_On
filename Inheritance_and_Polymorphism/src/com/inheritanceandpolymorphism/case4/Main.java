package com.inheritanceandpolymorphism.case4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		shapeDriver();
		
	}
	
	private static void shapeDriver() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		double input1;
		double input2;
		
		System.out.println("Enter the Shape: " +
						   "\n1. Circle" +
						   "\n2. Rectangle" +
						   "\n3. Triangle");
		choice = Integer.parseInt(br.readLine());
		
		switch(choice) {
		case 1: //Circle
			System.out.println("Enter the Radius : ");
			input1 = Double.parseDouble(br.readLine());
			Circle circle = new Circle(input1);
			circle.computeArea();
			System.out.format("Area of Circle is : %.2f ",circle.area);
			break;
			
		case 2: //Rectangle
			System.out.println("Enter the length and breadth : ");
			input1 = Double.parseDouble(br.readLine());
			input2 = Double.parseDouble(br.readLine());
			Rectangle  rectangle = new Rectangle(input1,input2);
			rectangle.computeArea();
			System.out.format("Area of Rectangle is : %.2f" ,rectangle.area);
			break;
			
		case 3: //Rectangle
			System.out.println("Enter the base and height : ");
			input1 = Double.parseDouble(br.readLine());
			input2 = Double.parseDouble(br.readLine());
			Triangle triangle = new Triangle(input1,input2);
			triangle.computeArea();
			System.out.format("Area of Triangle is :  %.2f",triangle.area);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}

