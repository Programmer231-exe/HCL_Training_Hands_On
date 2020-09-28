package com.hcltrainings.lambdawithcollection;

import java.util.TreeMap;

public class SortedMapwithLambda {
	public static void main(String[] args) {
		TreeMap<Integer,String> m = new TreeMap<Integer,String>((m1,m2)->(m1>m2)?1:(m1<m2)?-1:0);
		m.put(100, "Sunny");
		m.put(600, "Bunney");
		m.put(300,"Chinney");
		m.put(700, "Vinny");
		m.put(400, "Pinny");
		System.out.println(m);
	}
}
