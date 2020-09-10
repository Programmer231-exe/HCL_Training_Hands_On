package com.countryairport;

public class Country {
	private String iataCountryCode;
	private String countryName;
	public String getIataCountryCode() {
		return iataCountryCode;
	}
	public void setIataCountryCode(String iataCountryCode) {
		this.iataCountryCode = iataCountryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Country(String iataCountryCode, String countryName) {
		super();
		this.iataCountryCode = iataCountryCode;
		this.countryName = countryName;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
