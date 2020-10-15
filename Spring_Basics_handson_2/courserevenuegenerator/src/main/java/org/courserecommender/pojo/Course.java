package org.courserecommender.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
	public Course(String name, String mentor, double fee) {
		super();
		this.name = name;
		this.mentor = mentor;
		this.fee = fee;
	}
	
	public void setDetails(String name, String mentor, double fee) {
		this.name = name;
		this.mentor = mentor;
		this.fee = fee;
	}
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("Course Name : "+ this.getName() +
							"\nMentor Name : " + this.getMentor() + 
							"\nFees : " + this.getFee());
	}
	
	
}
