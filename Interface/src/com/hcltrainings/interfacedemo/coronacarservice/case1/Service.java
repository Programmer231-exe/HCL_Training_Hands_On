package com.hcltrainings.interfacedemo.coronacarservice.case1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Service implements Car {
	private int carNumber;
	private int carNumberTotal;
	public int getCarNumberTotal() {
		return carNumberTotal;
	}
	public void setCarNumberTotal(int carNumberTotal) {
		this.carNumberTotal = carNumberTotal;
	}

	private int years;
	private String carBrand;
	
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public Service(int carNumber, int years, String carBrand) {
		super();
		this.carNumber = carNumber;
		this.years = years;
		this.carBrand = carBrand;
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void sum() {
		System.out.println("Enter the Car Number:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		}catch(Exception e) {
			System.err.println("Exception handled in the method");
			System.exit(0);
		}
		
		int remainder,sum = 0;
		while(n!= 0) {
			remainder = n%10;
			sum = sum + remainder;
			n = n /10;
		}
		this.setCarNumberTotal(sum);
	}
	
	public void years() {
		System.out.println("How many years car do you have the Car:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			this.setYears(Integer.parseInt(br.readLine()));
		}catch(IOException e) {
			System.err.println("Exception handled in the method");
			System.exit(0);
		}
		
	}
	
	public void brand() {
		System.out.println("Car Brand: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			this.setCarBrand(br.readLine());
		}catch(IOException e) {
			System.err.println("Exception handled in the method");
			System.exit(0);
		}
		

	}
}
