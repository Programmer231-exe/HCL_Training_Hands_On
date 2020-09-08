package com.abstract_class_introduction.case2;

public class Event {
	
	protected String name;
	protected String detail;
	protected String ownerName;
	
	public double projectedRevenue() {
		double projected_revenue = 0.0;
		return projected_revenue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
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

	public Event(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}
	
	
}
