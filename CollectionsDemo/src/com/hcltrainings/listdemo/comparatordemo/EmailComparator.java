package com.hcltrainings.listdemo.comparatordemo;

import java.util.Comparator;

public class EmailComparator implements Comparator<User> {
	public int compare(User user1,User user2) {
		return user1.getEmail().compareTo(user2.getEmail());
	}
}
