package com.hcltrainings.stringdemo.case8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String humptySentence;
		try {
			System.out.println("Enter Humpty's Sentence");
			humptySentence = br.readLine();
			System.out.println("Converted String : " + CheckStrings.convertString(humptySentence));
			
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
