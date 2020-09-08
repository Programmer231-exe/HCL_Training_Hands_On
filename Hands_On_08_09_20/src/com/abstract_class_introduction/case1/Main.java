package com.abstract_class_introduction.case1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		shapeManager();

	}
	
	private static void shapeManager() throws IOException{
		
		int choice;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("" +
							"\n1.Circle" + 
							"\n2.Rectangle" + 
							"\n3.Square");
		
		float radius;
		float length;
		float breadth;
		float side;
		choice = Integer.parseInt(br.readLine());
		Shape s;
		
		switch(choice){
		case 1: 
			System.out.println("Enter the radius of the Circle");
			radius = Float.parseFloat(br.readLine());
			s = new Circle(radius);
			System.out.format("The Perimeter is %.2f" , s.calculatePerimeter());
			break;
		
		case 2:
			System.out.println("Enter the length of the Rectangle");
			length = Float.parseFloat(br.readLine());
			System.out.println("Enter the breadth of the Rectangle");
			breadth = Float.parseFloat(br.readLine());
			s = new Rectangle(length,breadth);
			System.out.format("The Perimeter is %.2f" , s.calculatePerimeter());
			break;
			
		case 3:
			System.out.println("Enter the Side of the Square");
			side = Float.parseFloat(br.readLine());
			s = new Square(side);
			System.out.format("The Perimeter is %.2f",s.calculatePerimeter());
			break;
			
		}
		
	}

}
