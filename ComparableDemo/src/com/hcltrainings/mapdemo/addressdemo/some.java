package com.hcltrainings.mapdemo.addressdemo;

import java.util.ArrayList;
import java.util.function.Function;

public class some {
	public static void main(String[] args) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(10);
		c.add(20);
		Function<ArrayList<Integer>,Integer> f = a1 -> a1.get(0);
		System.out.println(f.apply(c));
		
	}
}
