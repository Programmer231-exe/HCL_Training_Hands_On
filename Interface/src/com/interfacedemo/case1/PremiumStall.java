package com.interfacedemo.case1;

public class PremiumStall implements Stall {
	
	private String stallName;
	private int cost;
	private String ownerName;
	private int projector;
	public PremiumStall(String stallName, int cost, String ownerName, int projector) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
	}
	public PremiumStall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}
	
	public void display() {
		System.out.println("\n" + 
						   "\nStall Name : " + this.getStallName() +
						   "\nStall Cost : " + this.getCost() +
						   "\nStall OwnerName : " + this.getOwnerName() +
						   "\nNumber of Projectors : " + this.getProjector());
	}

}
