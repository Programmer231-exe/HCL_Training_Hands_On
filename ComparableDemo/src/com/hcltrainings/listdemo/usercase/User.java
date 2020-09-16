package com.hcltrainings.listdemo.usercase;

public class User {
	private String name;
	private String contactNumber;
	private String userName;
	private String emai;
	public User(String name, String contactNumber, String userName, String emai) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.userName = userName;
		this.emai = emai;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmai() {
		return emai;
	}
	public void setEmai(String emai) {
		this.emai = emai;
	}
	public void display() {
		System.out.format("\n%-20s %-20s %-20s %-20s",this.getName(),this.getContactNumber(),this.getUserName(),this.getEmai());
	}

}
