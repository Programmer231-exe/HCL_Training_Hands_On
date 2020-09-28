package com.hcltrainings.multithreadingdemo.case3;

public class MyThread extends Thread {
	public void run() {
		for(int i =0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
	
	@Override
	public void start() {
		System.out.println("STart Method");
	}
}
