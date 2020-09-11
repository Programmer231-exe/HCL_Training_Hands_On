package com.hcltrainings.stringdemo.case6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String humptySentence; 
		String dumptyChange;
		int position;
		try {
			System.out.println("Enter Humpty's Sentence");
			humptySentence = br.readLine();
			System.out.println("Dumpty Says : " + humptySentence);
			System.out.println("What Dumpty wants to insert & where:");
			dumptyChange = br.readLine() + " ";
			System.out.println("Enter the Position");
			position = Integer.parseInt(br.readLine());
			System.out.println("Humpty's New Sentence: " + CheckStrings.insertData(humptySentence, dumptyChange,position));
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
