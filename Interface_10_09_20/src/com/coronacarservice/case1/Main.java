package com.coronacarservice.case1;

public class Main {
	public static void main(String[] args) {
		Car service = new Service();
		service.sum();
		service.years();
		service.brand();
		serviceProvider(service);
	}
	
	private static void serviceProvider(Car service) {
		Service servicer = (Service)service;
		System.out.println("You can come on " + allocatedDays(servicer.getCarNumberTotal()));
		if(isItFree(servicer.getYears())) {
			System.out.println("Your Servicing Charge are : 0");
			System.out.println("You are eligible for Free Washing");
		}else {
			System.out.println("Your Servicing Charge are : " + discountPrice(servicer.getCarBrand()));
			System.out.println("You are not eligible for Free Washing");
		}
	}
	
	private static String allocatedDays(int number) {
		if(number % 2 == 0)
			return "Tuesday, Thursday,Saturday";
		else
			return "Monday,Wednesday,Friday";
	}
	
	private static boolean isItFree(int years) {
		if(years > 5)
			return true;
		else 
			return false;
	}
	
	private static double discountPrice(String brandName) {
		if(brandName.equals("Maruti")) {
			double tobePay = 0;
			tobePay = Car.SERVICE_CHARGE - ((5.0/100) * Car.SERVICE_CHARGE);  
			return tobePay;
		}else 
			return Car.SERVICE_CHARGE;
	}
}
