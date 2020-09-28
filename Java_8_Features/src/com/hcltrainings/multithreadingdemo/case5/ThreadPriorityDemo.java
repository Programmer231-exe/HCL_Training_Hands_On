package com.hcltrainings.multithreadingdemo.case5;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		MyThread t  = new MyThread();
		System.out.println(t.getPriority());

	}

}
