package com.hcltrainings.reversedeom;

import java.util.Comparator;
import java.util.Map;

public class MyComparator implements Comparator<Map.Entry<Integer,User>>{
	public int compare(Map.Entry<Integer,User> obj1,Map.Entry<Integer,User> obj2) {
		User user1 = obj1.getValue();
		User user2 = obj2.getValue();
		return user1.getName().compareTo(user2.getName());
	}
}