package com.hcltrainings.listdemo.comparatordemo;

import java.util.Comparator;

public class NameComparator implements Comparator<User>{
	public int compare(User user1,User user2) {
		return user1.getName().compareTo(user2.getName());
	}
}
