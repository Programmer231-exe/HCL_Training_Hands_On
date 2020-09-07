package com.I_and_K_Suppliers.case4;

public class Product {
	
	private int product_code;
	private String product_name;
	private double price;
	private int stock;
	public final static String COMPANY_NAME = "I & K Suppliers";
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Product(int product_code, String product_name, double price, int stock) {
		super();
		this.product_code = product_code;
		this.product_name = product_name;
		this.price = price;
		this.stock = stock;
	}
	
	
	public Product() {
		
	}
	
	
	public void checkPrice(Product product) {
		if(Double.compare(this.getPrice(), product.getPrice())== 0) {
			System.out.println(this.getProduct_name() + "'s price is same as "  + product.getProduct_name() +"'s price");
		}else if(Double.compare(this.getPrice(), product.getPrice()) > 0) {
			System.out.println(product.getProduct_name() + " is cheaper than " + this.getProduct_name());
		}else {
			System.out.println(this.getProduct_name() + " is cheaper than " + product.getProduct_name());
		}
	}
	
	public double getDiscountedPrice() {
		if(this.price >= 80000) {
			return (((double)30/100) * this.price);
		}else if(this.price >= 60000){
			return (((double)20/100) * this.price);
		}else if(this.price >= 50000) {
			return (((double)10/100) * this.price);
		}else {
			return (((double)5/100) * this.price);
		}
	}
	
	
	
	
	public void printProductDetails() {
			System.out.println("\n" + COMPANY_NAME + 
					"\nProduct Code : " + this.getProduct_code() + 
					"\nName : " + this.getProduct_name() +
					"\nStock : " + this.getStock() + 
					"\nPrice : Rs." + this.getPrice() +
					"\nDiscounted Price : Rs." + this.getDiscountedPrice());
		
	}
	
	public static Product checkLessStock(Product[] products) {
		int min = products[0].getStock();
		int index = 0; 
		for(int i = 0; i < products.length; i++) {
			if(products[i].getStock() < min) {
				min = products[i].getStock();
				index = i;
			}
		}
		
		return products[index];
	}

}
