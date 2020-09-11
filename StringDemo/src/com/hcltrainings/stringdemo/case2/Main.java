package com.hcltrainings.stringdemo.case2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String humptySentence,dumptySentence;
		try {
			System.out.println("Enter Humpty's Sentence");
			humptySentence = br.readLine();
			System.out.println("Enter Dumpty's Word:");
			dumptySentence = br.readLine();
			if(CheckStrings.stringFound(humptySentence, dumptySentence)) {
				System.out.println("Found");
			}else {
				System.out.println("Not Found");
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
