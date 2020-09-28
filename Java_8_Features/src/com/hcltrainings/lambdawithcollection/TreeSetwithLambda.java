package com.hcltrainings.lambdawithcollection;

import java.util.TreeSet;

public class TreeSetwithLambda {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>((t1,t2) -> (t1>t2)?1:(t1<t2)?-1:0);
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		System.out.println(t);
	}
}
