package com.I_and_K_Suppliers.case1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		int product_code;
		String product_name;
		double price;
		int stock;
		Product[] products = new Product[2];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Product Details");
		for(int i = 0; i < 2; i++) {
			System.out.println("Enter the Product Code:");
			product_code = Integer.parseInt(br.readLine());
			System.out.println("Enter the Product Name:");
			product_name = br.readLine();
			System.out.println("Enter the Price in Rs. :");
			price = Double.parseDouble(br.readLine());
			System.out.println("Enter the available Stocks:");
			stock = Integer.parseInt(br.readLine());
			
			products[i] = new Product();
			products[i].setProduct_code(product_code);
			products[i].setProduct_name(product_name);
			products[i].setPrice(price);
			products[i].setStock(stock);
		}
		
		System.out.println("Product Details : ");
		for(Product product : products) {
			System.out.println("\n" + 
					"\nProduct Code : " + product.getProduct_code() + 
					"\nName : " + product.getProduct_name() +
					"\nPrice : Rs." + product.getPrice() +
					"\nStock : " + product.getStock());
		}
		
		System.out.println();
		products[0].checkPrice(products[1]);
		

	}

}
