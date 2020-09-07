package com.hands_on_04_09_2020.Object_Relation_Film_Actors;

public class Actor{
	private int id;
	private String name;
	private String contact_no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public Actor(int id, String name, String contact_no) {
		super();
		this.id = id;
		this.name = name;
		this.contact_no = contact_no;
	}
	
	public Actor() {
		
	}
}