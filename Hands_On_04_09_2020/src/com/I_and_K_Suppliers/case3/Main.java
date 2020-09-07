package com.I_and_K_Suppliers.case3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static Product buildProduct() throws IOException {
		int product_code;
		String product_name;
		double price;
		int stock;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Product Detail");
			System.out.println("Enter the Product Code:");
			product_code = Integer.parseInt(br.readLine());
			System.out.println("Enter the Product Name:");
			product_name = br.readLine();
			System.out.println("Enter the Price in Rs. :");
			price = Double.parseDouble(br.readLine());
			System.out.println("Enter the available Stocks:");
			stock = Integer.parseInt(br.readLine());
			
			Product product = new Product();
			product.setProduct_code(product_code);
			product.setProduct_name(product_name);
			product.setPrice(price);
			product.setStock(stock);
		
			return product;
	}
	
	public static void main(String[] args) throws IOException {
		
		Product minStockProduct; 
		Product[] products = new Product[5];
		
		for(int i = 0; i < 5; i++) {
			products[i] = buildProduct();
		}
		
		
		System.out.println("\nProduct Details : ");
		for(Product product : products) {
			product.printProductDetails();
		}
		
		minStockProduct = Product.checkLessStock(products);
		System.out.println("The Product with Min Stock\n");
		System.out.println("\n" + Product.COMPANY_NAME +
						   "\nName : " + minStockProduct.getProduct_name() +
						   "\nStock : " + minStockProduct.getStock());
		
	}

}
