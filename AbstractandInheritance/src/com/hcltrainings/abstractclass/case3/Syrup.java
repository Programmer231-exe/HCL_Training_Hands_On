package com.hcltrainings.abstractclass.case3;


public class Syrup extends Medicine{
	

	
	@Override
	public void displayLabel() {
		System.out.println("Take Physician's advice "
				+ "\nDosage: " 
				+ "\nAdult : 2 Spoons twice a day"  
				+ "\nChildren : 1 spoon twice a day");
		
	}

}
