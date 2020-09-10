package com.countryairport;

public class CountryBO {
	
	public static Country createCountry(String country) {
		String[] countryDetail = country.split(",");
		String iataCountryCode = countryDetail[0];
		String countryName = countryDetail[1];
		
		return new Country(iataCountryCode,countryName);
	}

}
