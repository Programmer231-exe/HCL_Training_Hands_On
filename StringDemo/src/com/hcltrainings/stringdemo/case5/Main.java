package com.hcltrainings.stringdemo.case5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String humptySentence; 
		String dumptySentence;
		try {
			System.out.println("Enter Humpty's Sentence");
			humptySentence = br.readLine();
			System.out.println("Dumpty Says : " + humptySentence);
			System.out.println("What Dumpty wants to remove:");
			dumptySentence = br.readLine();
			System.out.println("Dumpty's New Sentence: " + CheckStrings.editString(humptySentence, dumptySentence));
		} catch (IOException ioe) {
			System.err.println("Error handled in the method");
			System.err.println(ioe);
		}
		if (br != null) {
			try {
				br.close();
			} catch (IOException ioe) {
				System.err.println("Exception handled in the method");
			}
		}

	}

}
