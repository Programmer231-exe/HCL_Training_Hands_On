package com.Inheritance_and_Polymorphism.hands_on_case3;

public class Stall {
	
	public String name;
	public String detail;
	public String ownerName;
	public Stall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public Double computeCost(String stallType,int squareFeet) {
		double costPerSquarefeet = 0.0;
		if(stallType.equals("Platinum")) {
			costPerSquarefeet = 200.0;
		}else if(stallType.equals("Diamond")) {
			costPerSquarefeet = 150.0;
		}else if(stallType.equals("Gold")) {
			costPerSquarefeet = 100.0;
		}
		
		return costPerSquarefeet * squareFeet;
	}
	
	public Double computeCost(String stallType,int squareFeet,int noOfTV) {
		double costPerSquarefeet = 0.0;
		double costOfTV= 10000;
		if(stallType.equals("Platinum")) {
			costPerSquarefeet = 200.0;
		}else if(stallType.equals("Diamond")) {
			costPerSquarefeet = 150.0;
		}else if(stallType.equals("Gold")) {
			costPerSquarefeet = 100.0;
		}
		
		return costPerSquarefeet * squareFeet +(costOfTV * noOfTV);
	}

}
