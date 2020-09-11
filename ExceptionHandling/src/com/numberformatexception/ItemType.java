package com.numberformatexception;

public class ItemType {
	
	private String name;
	private double deposit;
	private double costPerDay;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public ItemType(String name, double deposit, double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public ItemType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "\nName : " + this.getName() + "\nDeposit: " + this.getDeposit() + "\nCost Per Day:" + this.getCostPerDay();
	}
	
	

}
