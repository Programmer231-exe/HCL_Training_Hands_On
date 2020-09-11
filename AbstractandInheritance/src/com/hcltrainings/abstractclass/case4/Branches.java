package com.hcltrainings.abstractclass.case4;

public class Branches {
	private String name;
	private int seats;
	private double fees;
	private String department_head;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getDepartment_head() {
		return department_head;
	}
	public void setDepartment_head(String department_head) {
		this.department_head = department_head;
	}
	public Branches() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branches(String name, int seats, double fees, String department_head) {
		super();
		this.name = name;
		this.seats = seats;
		this.fees = fees;
		this.department_head = department_head;
	}
	
	
}
