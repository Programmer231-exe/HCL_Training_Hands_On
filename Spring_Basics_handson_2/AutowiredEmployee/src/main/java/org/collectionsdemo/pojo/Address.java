package org.collectionsdemo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private String line1;
	private String line2;
	private String city;
	private String pincode;

	
	public Address() {
		super();
	}

	
	public Address(@Value("2/115 Anna Nagar") String line1,@Value("Kaveripattinam") String line2, @Value("Krishnagiri")String city,@Value("635112")String pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.pincode = pincode;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	

	public void display() {
		System.out.println("Address:" + "\n" + this.getLine1() + "\n" + this.getLine2() + "\n" + this.getCity() + "\n"
				+ this.getPincode());
	}
}
