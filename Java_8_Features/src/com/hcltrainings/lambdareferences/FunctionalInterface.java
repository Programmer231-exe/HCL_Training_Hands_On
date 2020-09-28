package com.hcltrainings.lambdareferences;

public interface FunctionalInterface {
	
	void methodReference();
	
	static void display() {
		System.out.println("This is functional interface");
	}
	
	default void show() {
		System.out.println("This is also functional interface");
	}
}
