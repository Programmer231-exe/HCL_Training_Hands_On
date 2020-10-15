package org.qualifierdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;
	private int age;
	private String city;
	@Autowired(required = true)
	@Qualifier("order2")
	private Order order;
	public User(String name, int age, String city, Order order) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.order = order;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	
	//@Value("Jagan")
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	//@Value("24")
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	//@Value("Chennai")
	public void setCity(String city) {
		this.city = city;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void display() {
		System.out.println("\nName : " + this.getName() +
							"\nAge : " + this.getAge() +
							"\nCity : " + this.getCity() 
							);
		
		this.getOrder().display();
	}
	
}
