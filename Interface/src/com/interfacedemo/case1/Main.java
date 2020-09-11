package com.interfacedemo.case1;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Stall stall = StallManager.getStall();
		stall.display();
	}
	
}
