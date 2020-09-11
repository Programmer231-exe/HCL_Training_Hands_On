package com.inheritanceandpolymorphism.case4;

public class Circle extends Shape{
	private double radius;

	public Circle() {
		super();
		
	}
	
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public void computeArea() {
		super.area =  ((22.0/7.0) * this.getRadius() * this.getRadius());
	}
	
	
}
