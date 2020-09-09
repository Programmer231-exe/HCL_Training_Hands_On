package com.inheritance.case2;

public class Ayurvedic extends Medical {
	private String[] botanical_garden_list;
	
	public String[] getBotanical_garden_list() {
		return botanical_garden_list;
	}

	public void setBotanical_garden_list(String[] botanical_garden_list) {
		this.botanical_garden_list = botanical_garden_list;
	}

	@Override
	public String calcFees(String name,int marks, double actual_fee) {
		return name + " need to pay " + actual_fee;
	}
}