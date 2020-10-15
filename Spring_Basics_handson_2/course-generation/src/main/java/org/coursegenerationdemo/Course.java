package org.coursegenerationdemo;

public class Course {
	private String name;
	private String mentor;
	private double fee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public void display() {
		System.out.println("Course : " + this.getName() + 
							"\nSME by " + this.getMentor() +
							"\nFee " + this.getFee());
	}
}
