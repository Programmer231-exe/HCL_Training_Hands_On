package com.hcltrainings.abstractclass.case1;

public class Square extends Shape{
	private float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	
	
	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public double calculatePerimeter() {
		return 4 * this.getSide();
	}
	
	
}
