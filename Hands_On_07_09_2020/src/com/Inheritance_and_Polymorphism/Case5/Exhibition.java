package com.Inheritance_and_Polymorphism.Case5;

public class Exhibition extends Event {
	private int noOfStall;
	
	public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}

	public Exhibition() {
		
	}
	
	public Exhibition(String name, String detail , String ownerName,int noOfStall) {
		super.name = name;
		super.detail = detail;
		super.ownerName = ownerName;
		this.noOfStall = noOfStall;
	}
	
	@Override 
	public double projectedRevenue() {
		return this.getNoOfStall() * 100.0;
	}
}
