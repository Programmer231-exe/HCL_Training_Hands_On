package com.interfacedemo.case2;

public class Rectangle implements Polygon{
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
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double calcArea() {
		return this.getLength() * this.getBreadth();
	}
	public double calcPeri() {
		return 2 * (this.getLength() + this.getBreadth());
	}
}
