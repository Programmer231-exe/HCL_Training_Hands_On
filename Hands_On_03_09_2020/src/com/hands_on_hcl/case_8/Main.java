package com.hands_on_hcl.case_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count;
		String wicketDetails;
		String[] wicketDetail;
		long over;
		long ball;
		String wicketType;
		String playerName;
		String bowlerName;
		
		System.out.println("Enter the Number of Wickets:");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		scanner.nextLine();
		
		Wicket[] wickets = new Wicket[count];
		
		
		//==>Observation:
		//==> I think for-each loop is not best for modifying the array from my experience. Since when I implement the below method 
		//==>in for each loop . I can not able to initiate the object and one more point I cannot able to track the index also.
		for(int i = 0; i < count; i++) {
			System.out.println("\nEnter the details of Wicket" +(i+1) +":");
			wicketDetails = scanner.nextLine(); //over,ball,wicketType,playerNmae,bowlerName
			wicketDetail = wicketDetails.split(",");
			over = (long)Integer.parseInt(wicketDetail[0]);
			ball = (long)Integer.parseInt(wicketDetail[1]);
			wicketType = wicketDetail[2];
			playerName = wicketDetail[3];
			bowlerName = wicketDetail[4];
			
			wickets[i] = new Wicket(over,ball,wicketType,playerName,bowlerName);
		}
		
		
		System.out.println("Wicket Details:\n");
		for(Wicket wicket : wickets) {
			wicket.displayWicketDetails();
		}
		
		//for(int i = 0; i < count ; i++) {
		//	wickets[i].displayWicketDetails();
		//}
		
		scanner.close();
	}

}
