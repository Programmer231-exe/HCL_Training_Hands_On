package org.hibernatedemo.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmbeddedContact {
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public EmbeddedContact(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public EmbeddedContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Contact [ address = " + address + " , phone = " + phone  + ", recipient = " + name + "]";
	}
	
}
