package com.hcltrainings.stringdemo.case11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String email;
		String[] validDomain = {".com",".in",".net",".org"};
		try {
			System.out.println("Enter the Email Address");
			email = br.readLine();
			if(isValid(email,validDomain)) {
				System.out.println("Valid Email Address");
			}else {
				System.out.println("Invalid Email Address");
			}
					
		}catch(IOException ioe) {
			System.err.println("Error handled in the main() method");
			System.out.println(ioe);
		}
		
		
	}
	
	private static boolean isValid(String email,String[] domains) {
		int length;
		boolean ans = false;
		for(int i = 0; i < domains.length; i++) {
			length = domains[i].length();
			if(domains[i].equals(email.substring((email.length() - length), email.length()))){
				ans = true;
				break;
			}
					
		
		}
		return ans;
	}
}
