package com.hcltrainings.listdemo.comparabledemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AddressFactory {
	public static List<Address> tbGenerator(int count) {
		List<Address> addressList = new ArrayList<Address>();
		String detail = null;
		String[] splittedDetail;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter User address in CSV(Username,AddressLine1,AddressLine2,Pincode");
		for(int i = 0 ; i < count; i++) {
			
			try {
				detail = br.readLine();
				splittedDetail = detail.split(",");
				addressList.add(new Address(splittedDetail[0],splittedDetail[1],splittedDetail[2],Integer.parseInt(splittedDetail[3])));
			}catch(IOException ioe) {
				System.err.println("Some problem with reading");
			}
			
			
			
		}
		
		return addressList;
	
		
	}
}
