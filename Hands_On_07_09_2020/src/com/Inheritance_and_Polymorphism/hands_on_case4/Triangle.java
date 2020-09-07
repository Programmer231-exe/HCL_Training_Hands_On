package com.Inheritance_and_Polymorphism.hands_on_case4;

public class Triangle extends Shape {
	private double base;
	private double height;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void computeArea() {
		super.area = (1.0/2.0) * this.getBase() * this.getHeight();
	}
}
