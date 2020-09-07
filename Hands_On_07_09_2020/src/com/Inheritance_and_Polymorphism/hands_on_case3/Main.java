package com.Inheritance_and_Polymorphism.hands_on_case3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static void stallCostCalculator(Stall stall) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String type;
		int size;
		char doesHaveTv;
		int countOfTv;
		
		System.out.println("Enter the type of the Stall:");
		type = br.readLine();
		System.out.println("Enter the size of the stall in square feet:");
		size = Integer.parseInt(br.readLine());
		System.out.println("Does the hall have TV?(y/n)");
		doesHaveTv = br.readLine().charAt(0);
		
		if(doesHaveTv == 'y') {
			System.out.println("Enter the Number of TV:");
			countOfTv = Integer.parseInt(br.readLine());
			System.out.format("The Cost of the Stall is Rs.%10.2f" ,stall.computeCost(type, size, countOfTv));
		}else {
			System.out.format("The Cost of the Stall is Rs.%10.2f" , stall.computeCost(type, size));
		}
	}
	public static void main(String[] args) throws IOException{
		String name;
		String detail;
		String ownerName;
		Stall stall;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name of the stall: ");
		name = br.readLine();
		System.out.println("Enter the detail of the stall: ");
		detail = br.readLine();
		System.out.println("Enter the owner name of the stall : ");
		ownerName = br.readLine();
		
		stall = new Stall(name,detail,ownerName);
		
		stallCostCalculator(stall);
		
		

	}

}
