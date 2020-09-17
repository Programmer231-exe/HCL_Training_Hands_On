package com.hcltrainings.listdemo.usercase;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class UserBO extends ArrayList<User>{

	static UserBO getList() {
		UserBO userList = new UserBO();
		userList.add(new User("Mohan Raja","9874563210","mohan","mohan@abc.in"));
		userList.add(new User("arjun Ravi","4324237","arjun","arjun@abc.in"));
		userList.add(new User("Arun Kumar","984561230","arun","arun@abc.in"));
		userList.add(new User("Prakash raj","7548921445","prakash","raj@abc.in"));
		userList.add(new User("Ram ganesh","9874587457","Ram","ramg@abc.in"));
		return userList;
	}
	
	public void remove(int n1,int n2) {
		this.removeRange(n1, n2);
	}
	
	

}
