package com.hcltrainings.stringdemo.case12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String date;
		try {
			System.out.println("Enter the date Value");
			date = br.readLine();
			dateCorrector(date);
		}catch(IOException ioe) {
			System.out.println("Error Occurs");
		}

	}
	
	private static void dateCorrector(String date) {
		String day = date.substring(0,2);
		String month = date.substring(3,5);
		String year = date.substring(6);
		
		System.out.println("Date in correct Format" + 
							"\n"+day+"-"+month+"-"+year);
		
	}

}
