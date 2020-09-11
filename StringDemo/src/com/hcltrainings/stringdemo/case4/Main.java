package com.hcltrainings.stringdemo.case4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String humptySentence,dumptySentence,replace;
		try {
			System.out.println("Enter Humpty's Sentence");
			humptySentence = br.readLine();
			System.out.println("Word to Replace");
			replace = br.readLine();
			System.out.println("Enter Dumpty's Synonym:");
			dumptySentence = br.readLine();
			System.out.println("Replaced String : " + CheckStrings.stringReplace(humptySentence, replace, dumptySentence));
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
