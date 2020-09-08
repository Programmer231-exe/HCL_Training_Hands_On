package com.abstract_class_introduction.case1;

public class Rectangle extends Shape {
	private float length;
	private float breadth;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double calculatePerimeter() {
		return 2 * (this.getLength() + this.getBreadth());
	}
	
	
	
}
