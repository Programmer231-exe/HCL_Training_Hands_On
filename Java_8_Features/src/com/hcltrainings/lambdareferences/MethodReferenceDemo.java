package com.hcltrainings.lambdareferences;

public class MethodReferenceDemo {
	private String name;
	private int id;
	
	
	
	public MethodReferenceDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MethodReferenceDemo(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void display() {
		System.out.println("This method defined inside MethodReference Class .It is not an implementation class");
	}
	
	public static void show() {
		System.out.println("This is a static method");
	}
	
	public String toString() {
		return "\t"+this.name + "\t" + this.id;
	}
}
