package com.hcltrainings.stringdemo.case10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String address1;
		String address2;
		try {
			System.out.println("Enter the Address 1");
			address1 = br.readLine();
			System.out.println("Enter the Address 2");
			address2 = br.readLine();
			
			if(address1.equals(address2)) {
				System.out.println("RED");
			}else if(address1.equalsIgnoreCase(address2)) {
				System.out.println("BLUE");
			}else if(address1.replace(" ","").equalsIgnoreCase(address2.replace(" ",""))) {
				System.out.println("YELLOW");
			}else
				System.out.println("GREEN");
		}catch(IOException ioe) {
			System.err.println("Error handled in the main() method");
			System.out.println(ioe);
		}
		
		
	}
}
