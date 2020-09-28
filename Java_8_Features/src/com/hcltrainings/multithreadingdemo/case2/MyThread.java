package com.hcltrainings.multithreadingdemo.case2;

public class MyThread extends Thread {
	public void run() {
		for(int i =0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
	
	public void run(int i) {
		System.out.println("Int arg Method");
	}
}
