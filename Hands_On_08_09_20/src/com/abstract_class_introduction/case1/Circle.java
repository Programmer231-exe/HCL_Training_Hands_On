package com.abstract_class_introduction.case1;

public class Circle extends Shape {
	private float radius;
	private static final double PI = 3.14;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double calculatePerimeter() {
		return PI * this.getRadius() * 2;
		
	}
	
}
