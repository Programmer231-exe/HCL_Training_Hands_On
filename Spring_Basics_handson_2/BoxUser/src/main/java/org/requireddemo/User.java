package org.requireddemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("defaultUser")
public class User {
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	
	@Value("Surya")
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	
	@Value("Surya")
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
