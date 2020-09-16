package com.hcltrainings.sortdemo;

import java.util.Comparator;

public class MyComparator implements Comparator<Hall>{
	
	public int compare(Hall h1,Hall h2) {
		if(h1.getCostPerDay() > h2.getCostPerDay())
			return 1;
		else if(h1.getCostPerDay() < h2.getCostPerDay())
			return -1;
		else 
			return 0;
	}

}
