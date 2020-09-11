package com.interfacedemo.case2;

public class Square implements Polygon{
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double calcPeri() {
		return 4  * this.getSide();
	}
	
	public double calcArea() {
		return this.getSide() * this.getSide();
	}
}
