package com.hcltrainings.lambdaexpressiondemo;

public class Main{
	public static void main(String[] args) {
		InterfaceDemo1 if1 = ()->{
			System.out.println("Lamba Expression " +
								"\n==>It is a nameless function" +
								"\n==>Introduced in java 8 mainly for imparting functional programming features"
					);
		};
		
		if1.run();
		
		MyThread mythread = new MyThread();
		mythread.start();
		
		Thread thread = new Thread(new MyRunnable());
		thread.start();
		
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Inside Anonynomous Class");
				for(int i =0; i < 10; i++) {
					System.out.println(i-1);
				}
			}
		});
		
		thread1.start();
		
		new Thread(() -> {
			
			for(int i =0; i < 10 ; i++) {
				System.out.println("Lambda Thread");
				System.out.println(i-2);
			}
		}).start();
	}
}
