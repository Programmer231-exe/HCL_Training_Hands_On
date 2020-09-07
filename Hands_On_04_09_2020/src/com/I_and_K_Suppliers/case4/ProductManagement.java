package com.I_and_K_Suppliers.case4;

public class ProductManagement {
	
	public static Product findCostlyProduct(Product[] products) {
		double high_price = products[0].getPrice();
		int index = 0;
		
		for(int i = 0; i < products.length; i++) {
			if(Double.compare(products[i].getPrice(),high_price) > 0) {
				high_price = products[i].getPrice();
				index = i;
			}
		}
		
		return products[index];
	}
	
	public static Product findCheapestProduct(Product[] products) {
		double low_price = products[0].getPrice();
		int index = 0;
		
		for(int i = 0; i < products.length; i++) {
			if(Double.compare(products[i].getPrice(),low_price) < 0) {
				low_price = products[i].getPrice();
				index = i;
			}
		}
		
		return products[index];
	}
}
