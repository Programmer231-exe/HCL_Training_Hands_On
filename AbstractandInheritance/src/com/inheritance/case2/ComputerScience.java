package com.inheritance.case2;

public class ComputerScience extends Engineering {

	@Override
	public String calcFees(String name, int marks, double fees) {
		if(marks > 90) {
			double payable = (50.0/100) * fees;
			return name + " need to pay Rs." + (fees - payable);
		}else
			return name + "need to pay Rs." + fees;
	}

	
}
