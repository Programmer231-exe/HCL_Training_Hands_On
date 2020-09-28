package com.hcltrainings.customizeobjectdsortingdemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(100,"Katrina"));
		e.add(new Employee(500,"Kareena"));
		e.add(new Employee(400,"Sunny"));
		e.add(new Employee(600,"Alia"));
		e.add(new Employee(200,"Malika"));
		System.out.println("Before Sorting");
		System.out.println(e);
		Collections.sort(e,(e1,e2) -> (e1.getEno() > e2.getEno() ? 1: (e1.getEno() < e2.getEno() ? -1:0)));
		System.out.println("After Sorting:");
		System.out.println(e);
	}
}
