package com.countryairport;

public class Airport {
	private String airportName;
	private Country country;
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Airport(String airportName, Country country) {
		super();
		this.airportName = airportName;
		this.country = country;
	}
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
