package com.hands_on_hcl.case_6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		String name;
		long runs;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the Extra Type Details");
		String extraTypeDetails = scanner.nextLine();
		String[] extraTypeDetail = extraTypeDetails.split("#");
		name = extraTypeDetail[0];
		runs = (long)Integer.parseInt(extraTypeDetail[1]);
		
		
		ExtraType extraType = new ExtraType();	
		extraType.setName(name);
		extraType.setRuns(runs);
		
		
		System.out.println("\nExtra Type Details: "
					+ "\nExtra Type :" + extraType.getName()
					+ "\nRuns : " + extraType.getRuns()
					);
		
		scanner.close();
	}

}
