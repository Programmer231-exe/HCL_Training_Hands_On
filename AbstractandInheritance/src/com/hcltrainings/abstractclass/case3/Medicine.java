package com.hcltrainings.abstractclass.case3;

import java.time.LocalDate;

abstract public class Medicine {
	private String name;
	private double price;
	private LocalDate expiryDate;
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public void getDetails() {
		System.out.println("\nMedicine Details:" +
							"\nMedicine Name : " + this.getName() + 
							"\nMedicine Price : " + this.getPrice() +
							"\nExpiry Date : " + this.getExpiryDate());
	}
	


	public abstract void displayLabel();
	
}
