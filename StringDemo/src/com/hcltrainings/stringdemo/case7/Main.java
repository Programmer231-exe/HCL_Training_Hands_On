package com.hcltrainings.stringdemo.case7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String humptySentence,dumptySentence;
		int result;
		try {
			System.out.println("Enter Humpty's Sentence");
			humptySentence = br.readLine();
			System.out.println("Enter Dumpty's Sentence:");
			dumptySentence = br.readLine();
			result = CheckStrings.checkWords(humptySentence, dumptySentence);
			if(result == 1) {
				System.out.println("Humpty has used more words");
			}else if(result == 2) {
				System.out.println("Dumpty has used more words");
			}else {
				System.out.println("Both have used equal number of words");
			}
		}catch(IOException ioe) {
			System.err.println("Error handled in the method");
			System.err.println(ioe);
		}
		if(br != null) {
			try {
				br.close();
			}catch(IOException ioe) {
				System.err.println("Exception handled in the method");
			}
		}
		
	}

}
