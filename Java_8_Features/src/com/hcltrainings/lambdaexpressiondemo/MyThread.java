package com.hcltrainings.lambdaexpressiondemo;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("My Thread");
		for(int i = 0 ; i < 10; i++)
			System.out.println("Inside MyThread Class" + (i*10));
	}

}
