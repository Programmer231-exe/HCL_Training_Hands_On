package com.hands_on_hcl.case_5;

public class Venue {
	private String name;
	private String city;
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
	
	public void displayVenueDetails() {
		System.out.println("Venue Details: \nVenue Name: " + this.getName() + "\nCity Name:"  + this.getCity());
	}
	
}
