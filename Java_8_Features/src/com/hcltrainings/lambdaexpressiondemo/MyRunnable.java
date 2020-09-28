package com.hcltrainings.lambdaexpressiondemo;

public class MyRunnable implements Runnable{
	
	public void run() {
		System.out.println("Runnable Interface");
		for(int i =0; i < 10; i++) {
			System.out.println("Inside myRunnable interface : " + (i+10));
		}
	}

}
