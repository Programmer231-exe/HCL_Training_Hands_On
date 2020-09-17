package com.iteratordemo.stall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StallFactory {
	public static List<Stall> tbGenerator(int count) {
		List<Stall> stallList = new ArrayList<Stall>();
		String detail = null;
		String[] splittedDetail;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0 ; i < count; i++) {
			System.out.println("Enter the Stall " + (i+1) + " details");
			try {
				detail = br.readLine();
				splittedDetail = detail.split(",");
				stallList.add(new Stall(splittedDetail[0],splittedDetail[1],splittedDetail[2],splittedDetail[3]));
			}catch(IOException ioe) {
				System.err.println("Some problem with reading");
			}
			
			
			
		}
		
		return stallList;
	
		
	}
}
