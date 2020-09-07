package com.hands_on_hcl.case_1;

public class Venue {
	private String name;
	private String city;
	
	public Venue(String name,String city) {
		this.name = name;
		this.city = city;
	}
	
	public Venue() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
