package com.inheritance.case1;

public class HLCollege {
	private String registration_no;
	private String name;
	private String place;
	private String trustee_names;
	private int foundation_year;
	public HLCollege(String registration_no, String name, String place, String trustee_names, int foundation_year) {
		super();
		this.registration_no = registration_no;
		this.name = name;
		this.place = place;
		this.trustee_names = trustee_names;
		this.foundation_year = foundation_year;
	}
	public HLCollege() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRegistration_no() {
		return registration_no;
	}
	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTrustee_names() {
		return trustee_names;
	}
	public void setTrustee_names(String trustee_names) {
		this.trustee_names = trustee_names;
	}
	public int getFoundation_year() {
		return foundation_year;
	}
	public void setFoundation_year(int foundation_year) {
		this.foundation_year = foundation_year;
	}
	
	
	public void showCollegInfo() {
		System.out.println("\n" + 
						   "\nRegistration Number : " +this.getRegistration_no() +
						   "\nCollege Name : " + this.getName() +
						   "\nCollege Location : " + this.getPlace() +
						   "\nTrustee Names : " + this.getTrustee_names() +
						   "\nFoundation Year : " + this.getFoundation_year());
	}


}
