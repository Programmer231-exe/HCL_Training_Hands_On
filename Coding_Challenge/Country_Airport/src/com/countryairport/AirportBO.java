package com.countryairport;

public class AirportBO {
	
	public static Airport createAirport(String airportDetail,Country[] countries) {
		String[] airportDetails = airportDetail.split(",");
		String airportName = airportDetails[0];
		String countryName = airportDetails[1];
		Country airportCountry = null;
		
		for(Country country : countries) {
			if(country.getCountryName().equals(countryName))
				airportCountry = country;
		}
		
		return new Airport(airportName,airportCountry);
	}
	
	
	public static String findCountryName(Airport[] airports,String airportname) {
		String countryName = null;
		for(Airport airport : airports) {
			if(airport.getAirportName().equals(airportname))
				countryName =airport.getCountry().getCountryName();
		}
		
		return countryName;
	}
	
	public static boolean findWhetherAirportsAreInSameCountry(Airport[] airports, String airportname1 , String airportname2) {
		String countryName1 = null;
		String countryName2 = null;
		boolean cond = false;
		for(Airport airport : airports) {
			if(airport.getAirportName().equals(airportname1)) {
				countryName1 = airport.getCountry().getCountryName();
			}
			
			if(airport.getAirportName().equals(airportname2)) {
				countryName2 = airport.getCountry().getCountryName();
			}
			
		}
		
		
		if(countryName1 != null && countryName2 != null) {
			if(countryName1.equals(countryName2))
				cond = true;
		}else {
			cond = false;
		}
		return cond;
	}

}
