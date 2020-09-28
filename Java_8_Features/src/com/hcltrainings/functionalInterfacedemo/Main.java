package com.hcltrainings.functionalInterfacedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>() {{
			add("Sivasankar");
			add("Aivasankar");
			add("Bivasankar");
			add("Civasankar");
		}
	};
	
	Collections.sort(stringList,new Comparator<String>() {
		public int compare(String str1,String str2) {
			return str1.compareTo(str2);
		}
	});
	
	for(String str : stringList) {
		System.out.println(str);
	}
	
	List<String> modifiedList = stringList.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
	for(String str : modifiedList) {
		System.out.println(str);
	}
	
	
	List<String> someList = stringList.stream().filter(str-> str.equals("Sivasankar")).collect(Collectors.toList());
	for(String str : someList) {
		System.out.println(str);
	}
}
}
