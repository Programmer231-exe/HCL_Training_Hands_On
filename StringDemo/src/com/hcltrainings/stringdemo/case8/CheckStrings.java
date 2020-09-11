package com.hcltrainings.stringdemo.case8;

public class CheckStrings {
	
	public static String convertString(String s1) {
		if((int)s1.charAt(0) > 97 && (int)s1.charAt(0)<122) {
			return s1.toUpperCase();
		}else 
			return s1.toLowerCase();
	}
}
