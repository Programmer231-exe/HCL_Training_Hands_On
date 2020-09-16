package com.hcltrainings.listdemo.comparabledemo;

public class Address implements Comparable<Address>{
	private String username;
	private String addressLine1;
	private String addressLine2;
	private int pinCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String username, String addressLine1, String addressLine2, int pinCode) {
		super();
		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public int compareTo(Address address) {
		if(this.getPinCode() > address.getPinCode()) {
			return 1;
		}else if(this.getPinCode()< address.getPinCode()) {
			return -1;
		}else {
			return this.getAddressLine1().compareTo(address.getAddressLine1());
		}
	}
	
	public String toString() {
		return this.getUsername() + "," + this.getAddressLine1() + "," + this.getAddressLine2() + ","+this.getPinCode();
	}
}
