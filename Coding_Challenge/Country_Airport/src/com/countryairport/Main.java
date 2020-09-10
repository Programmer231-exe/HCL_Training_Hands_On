package com.countryairport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		airportManager();
	}

	private static void airportManager() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countryCount;
		Country[] countries = null;
		System.out.println("Enter the Country Count");
		countryCount = Integer.parseInt(br.readLine());
		countries = new Country[countryCount];
		for(int i = 0; i < countryCount ; i++) {
			System.out.println("Enter the country " + i+1 + "details:");
			countries[i] = CountryBO.createCountry(br.readLine());
		}
		
		System.out.println("Enter the Airport count");
		int airportCount = Integer.parseInt(br.readLine());
		
		Airport[] airports = new Airport[airportCount];
		
		for(int i = 0; i < airportCount; i++) {
			System.out.println("Enter the Airport " +(i+1) + " Details");
			airports[i] = AirportBO.createAirport(br.readLine(), countries);
			
		}
		
		System.out.println("Enter the airport name for which you need to find the Country name:");
		String airportName = br.readLine();
		System.out.println(airportName + " belongs to " + AirportBO.findCountryName(airports, airportName));
		
		
		System.out.println("Enter the two airport names:");
		String airportName1 = br.readLine();
		String airportName2 = br.readLine();
		if(AirportBO.findWhetherAirportsAreInSameCountry(airports, airportName1, airportName2)) {
			System.out.println("The 2 airports are in the same Country");
		}else {
			System.out.println("The 2 airport are not in the same country");
		}
	}
}
