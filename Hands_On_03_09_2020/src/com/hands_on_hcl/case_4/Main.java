package com.hands_on_hcl.case_4;

import java.util.Scanner;

import com.hands_on_hcl.Player;

public class Main {

	public static void main(String[] args) {

		String name;
		String country;
		String skill;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Player Details:");
		String playerDetails = scanner.nextLine(); //playername, playercountry, playerskill
		String[] playerDetail = playerDetails.split(",");
		name = playerDetail[0];
		country = playerDetail[1];
		skill = playerDetail[2];
		
		Player player = new Player();
		player.setName(name); //player name
		player.setCountry(country); //player country
		player.setSkill(skill); //player Skill
		
		System.out.println("\n\nPlayer Details:\nPlayer Name:" + player.getName() +"\nCountry Name:"+player.getCountry() +"\nSkill:" + player.getSkill() );
		
		
		scanner.close();
	}
	
	
	

}
