package com.iandksuppliers.case4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
			
			Product product = new Product(product_code,product_name,price,stock);
			return product;
	}
	
	

	public static void main(String[] args) throws IOException {
		
		Product products[] = new Product[5]; 
		int menu;
		int initializer =  -1;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\t\t\t\tMenu\n" +
							   "\n\t\t1. Add Products" + 
			                   "\n\t\t2. Display Products" + 
			               	   "\n\t\t3. Get Discounted Price" +
			                   "\n\t\t4. Find Costly Product" +
			               	   "\n\t\t5. Find Cheapest Product " +
			               	   "\n\t\t6. Check Min Stock" + 
			                   "\n\t\t7. Exit\n" +
			                   "\nEnter Choice: ");
			menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				for(int i = 0; i < 5 ; i++) {
					products[i] = buildProduct();
				}
				initializer = 1;
				break;
				
				
			case 2:
				System.out.println("Product Details");
				if(initializer == 1) {
					for(Product product : products) {
						product.printProductDetails();
					}
					
				}else {
					System.err.println("There is no product details to display");
				}
				break;
				
			case 3:
				System.out.println("\t\t\tDiscounted Price of Products\n"
						+ "\tProduct Name\t\tDiscounted Price\n");
				
				if(initializer == 1) {
					for(Product product : products) {
						System.out.println("\n\t"+product.getProduct_name()+"\t\t\tRs."+product.getDiscountedPrice());
						
					}
				}else {
					System.err.println("There is no product details to display\nYou need to enter product details through menu 1");
				}
				
				break;
				
			case 4:
				if(initializer == 1) {
					Product costlyProduct = ProductManagement.findCostlyProduct(products);
					System.out.println(costlyProduct.getProduct_name() + "is the costliest Product");
				}else {
					System.err.println("There is no product to show\nYou need to enter product details through menu 1");
				}
				break;
			case 5:
				
				if(initializer == 1) {
					Product cheapProduct = ProductManagement.findCheapestProduct(products);
					System.out.println(cheapProduct.getProduct_name() + " is the cheapest Product");	
				}else {
					System.err.println("There is no product to show\nYou need to enter product details through menu 1");
				}
				
				break;
				
			case 6:
				if(initializer ==1) {
					Product minStockProduct = new Product();
					minStockProduct = Product.checkLessStock(products);
					System.out.println("The Product with min Stock is \n");
					System.out.println("\n" + Product.COMPANY_NAME +
									   "\nName : " + minStockProduct.getProduct_name() +
									   "\nStock : " + minStockProduct.getStock());	
				}else {
					System.err.println("There is no info to display\nYou need to enter product details through menu 1");
				}
				
				break;
				
			case 7:
				System.out.println("Thank you");
				break;
				
			}
			
			
			
			
		}while(menu != 7);
		
		scanner.close();
				
	}

}
