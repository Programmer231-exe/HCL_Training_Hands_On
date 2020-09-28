package com.hcltrainings.multithreadingdemo.case6;

public class Display {
	public synchronized void wish(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				System.err.println(ie.getMessage());
			}
			System.out.println(name);
		}
	}
}
