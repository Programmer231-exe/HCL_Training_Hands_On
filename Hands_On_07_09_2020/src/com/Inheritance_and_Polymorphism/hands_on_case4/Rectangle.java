package com.Inheritance_and_Polymorphism.hands_on_case4;

public class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void computeArea() {
		super.area = this.getLength() * this.getBreadth();
	}

}
