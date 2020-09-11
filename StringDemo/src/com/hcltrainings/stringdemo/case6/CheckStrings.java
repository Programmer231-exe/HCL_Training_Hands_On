package com.hcltrainings.stringdemo.case6;

public class CheckStrings {

	public static String insertData(String s1,String s2,int pos) {
		StringBuffer sb = new StringBuffer(s1);
		sb.insert((pos - 1), s2.toCharArray());
		return sb.toString();
	}
	
}
