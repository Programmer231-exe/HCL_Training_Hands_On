package com.hcltrainings.stringdemo.case9;

public class CheckStrings {
	
	public static boolean checkUpperCase(String s1) {
		boolean ans = false;
		char[] s1array = s1.toCharArray();
		
		for(char ch : s1array) {
			if(((int)ch > 65 && (int)ch < 90) | ch == ' ' )
				ans = true;
			else 
				ans = false;
		}
		
		return ans;
	}
}
