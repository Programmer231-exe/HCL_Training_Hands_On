package com.hcltrainings.stringdemo.case14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String eventName;
		String camelName;
		try {
			System.out.println("Enter the Event name");
			eventName = br.readLine();
			camelName = camelGenerator(eventName);
			System.out.println("Event Name in Camel Case \n" + camelName);
		}catch(Exception e) {
			System.out.println("ERror occurs");
		}
	}
	
	private static String camelGenerator(String s1) {
		String[] s2 = s1.split(" ");
		char fl = s2[1].charAt(0);
		s2[1] = Character.toString(fl).toUpperCase() + s2[1].substring(1);
		return s2[0] + s2[1];
	}
}
