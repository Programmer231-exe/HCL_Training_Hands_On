package com.hcltrainings.stringdemo.case2;

public class CheckStrings {

	public static String concatString(String string1, String string2) {
		return string1 + "." + string2;
	}

	public static boolean stringFound(String sentence, String word) {
	    boolean ans = false;
		int sentenceLength = sentence.length();
		int wordLength = word.length();
		for (int i = 0; i < sentenceLength; i++) {

				
				if((i+ wordLength) > sentenceLength) {
					break;
				}else {
					if (word.equals(sentence.substring(i,(i+wordLength)))) {
						ans = true;
						break;
					}
				}
				
		}

		return ans;

	}
	
}
