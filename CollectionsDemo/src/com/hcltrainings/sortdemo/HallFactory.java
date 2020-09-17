package com.hcltrainings.sortdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HallFactory {
	public static List<Hall> hlGenerator(int count) {
		List<Hall> hallList = new ArrayList<Hall>();
		String detail = null;
		String[] splittedDetail;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0 ; i < count; i++) {
			System.out.println("Enter the Stall " + (i+1) + " details");
			try {
				detail = br.readLine();
				splittedDetail = detail.split(",");
				hallList.add(new Hall(splittedDetail[0],splittedDetail[1],Double.parseDouble(splittedDetail[2]),splittedDetail[3]));
			}catch(IOException ioe) {
				System.err.println("Some problem with reading");
			}
			
			
			
		}
		
		return hallList;
	
		
	}
}
