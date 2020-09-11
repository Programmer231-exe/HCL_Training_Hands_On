package com.interfacedemo.case1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StallManager {
	
	public static Stall getStall() throws IOException{
		int choice;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stallDetail;
		String[] splittedDetail;
		String stallName;
		int cost;
		String ownerName;
		int count;
		System.out.println("Choose Stall Type" +
							"\n1)Gold Stall" +
							"\n2)Premium Stall"+
							"\n3)Executive Stall");
		choice = Integer.parseInt(br.readLine());
		Stall stall = null;
		switch(choice) {
		case 1:
			System.out.println("Enter Stall Details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV Sets");
			stallDetail = br.readLine();
			splittedDetail = stallDetail.split(",");
			stallName = splittedDetail[0];
			cost = Integer.parseInt(splittedDetail[1]);
			ownerName = splittedDetail[2];
			count = Integer.parseInt(splittedDetail[3]);
			stall = new GoldStall(stallName,cost,ownerName,count);
			break;
			
		case 2:
			System.out.println("Enter Stall Details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors");
			stallDetail = br.readLine();
			splittedDetail = stallDetail.split(",");
			stallName = splittedDetail[0];
			cost = Integer.parseInt(splittedDetail[1]);
			ownerName = splittedDetail[2];
			count = Integer.parseInt(splittedDetail[3]);
			stall = new GoldStall(stallName,cost,ownerName,count);
			break;
			
		case 3:
			System.out.println("Enter Stall Details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens");
			stallDetail = br.readLine();
			splittedDetail = stallDetail.split(",");
			stallName = splittedDetail[0];
			cost = Integer.parseInt(splittedDetail[1]);
			ownerName = splittedDetail[2];
			count = Integer.parseInt(splittedDetail[3]);
			stall = new GoldStall(stallName,cost,ownerName,count);
			break;
		
		
		}
							
		return stall;
	}
	
}
