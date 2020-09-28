package com.hcltrainings.multithreadingdemo.case4;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t= new MyThread();
		System.out.println(t.getName());
		Thread.currentThread().setName("Bhaskar Thread");
		System.out.println(Thread.currentThread().getName());
	}

}
