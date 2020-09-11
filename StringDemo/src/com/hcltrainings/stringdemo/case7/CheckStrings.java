package com.hcltrainings.stringdemo.case7;

public class CheckStrings {
	
	public static int checkWords(String s1,String s2) {
		String[] s1Count = s1.split(" ");
		String[] s2Count = s2.split(" ");
		int s1Wordcount = s1Count.length;
		int s2Wordcount = s2Count.length;
		if(s1Wordcount > s2Wordcount) {
			return 1;
		}else if(s1Wordcount < s2Wordcount) {
			return 2;
		}else
			return 0;
	
		
	}

}
