package com.inheritanceandpolymorphism.case5;

public class Main {
	public static void main(String[] args) {
		
		Event exhibitionEvent = new Exhibition("ABC","Electornics","xyz",5);
		Event stageEvent = new StageEvent("ABC","Electronics","xyz",5,14);
				
		System.out.println("Exhibtion Class Projected Revent Method: "+ exhibitionEvent.projectedRevenue());
		System.out.println("Stage Event Class Projected Revenue Method : " + stageEvent.projectedRevenue());
		
		
	}
}
