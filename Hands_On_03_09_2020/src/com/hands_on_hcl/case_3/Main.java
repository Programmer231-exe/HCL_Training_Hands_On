package com.hands_on_hcl.case_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String name;
		String country;
		String skill;
		
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the player name:");
		name = scanner.nextLine();
		System.out.println("Enter the country name:");
		country = scanner.nextLine();
		System.out.println("Enter the player Skill:");
		skill = scanner.nextLine();
		
		Player player = new Player();
		player.setName(name);
		player.setCountry(country);
		player.setSkill(skill);
		
		System.out.println("\n\nPlayer Details:\nPlayer Name : " + player.getName() +"\nCountry Name : "+player.getCountry() +"\nSkill : " + player.getSkill() );
		scanner.close();
	}
	
	
	

}
