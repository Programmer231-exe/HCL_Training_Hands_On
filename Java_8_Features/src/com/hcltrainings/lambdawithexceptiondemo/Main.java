package com.hcltrainings.lambdawithexceptiondemo;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		ThreadFunctionInterface tfi = () -> {
			Thread.sleep(1000);
		};
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println(i);
			tfi.stopingThread();
		}

	}

}
