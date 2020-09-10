package com.interfacedemo.case1;

public class GoldStall implements Stall {
	
	private String stallName;
	private int cost;
	private String ownerName;
	private int tvSet;
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
	public int getTvSet() {
		return tvSet;
	}
	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}
	public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
	}
	public GoldStall() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void display() {
		System.out.println("\n" + 
						   "\nStall Name : " + this.getStallName() +
						   "\nStall Cost : " + this.getCost() +
						   "\nStall OwnerName : " + this.getOwnerName() +
						   "\nNumber of TV Sets: " + this.getTvSet());
	}
	

}
