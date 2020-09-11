package com.inheritance.case2;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		ComputerScience computerScience = (ComputerScience)getEngineeringDetails();
		computerScience.showBranchDetails();
		computerScience.calcFees("Omkar", 95, computerScience.getBranches()[0].getFees());
		Ayurvedic ayurvedic = (Ayurvedic)getMedicalDetails();
		ayurvedic.showBranchDetails();
		ayurvedic.calcFees("Shweta", 91, ayurvedic.getBranches()[0].getFees());
		
		
		
	}
	
	private static Engineering getEngineeringDetails() throws IOException{
		System.out.println("Enter the Engineering College Details");
		String place = HLCollegeService.getPlace();		
		String registration_no = HLCollegeService.getRegno(place);
		String name = HLCollegeService.getCollegeName();
		String trustee_names = HLCollegeService.getTrusteeNames();
		int foundation_year = HLCollegeService.getFoundationYear();
		String building_name = HLCollegeService.getBuildingName();
		int no_of_branches = HLCollegeService.getBranches(); 
		Branches[] branches = HLCollegeService.declareBranches(no_of_branches);
		ComputerScience computerScience = new ComputerScience();
		computerScience.setPlace(place);
		computerScience.setRegistration_no(registration_no);
		computerScience.setTrustee_names(trustee_names);
		computerScience.setName(name);
		computerScience.setFoundation_year(foundation_year);
		computerScience.setBuilding_name(building_name);
		computerScience.setNo_of_branches(no_of_branches);
		computerScience.setBranches(branches);
		return computerScience;
		
		
	}
	
	private static Medical getMedicalDetails() throws IOException{
		System.out.println("Enter the Medical College Details: ");
		String place = HLCollegeService.getPlace();
		String registration_no = HLCollegeService.getRegno(place);
		String name = HLCollegeService.getCollegeName();
		String trustee_names = HLCollegeService.getTrusteeNames();
		int foundation_year = HLCollegeService.getFoundationYear();
		String building_name = HLCollegeService.getBuildingName();
		int no_of_branches = HLCollegeService.getBranches(); 
		Branches[] branches = HLCollegeService.declareBranches(no_of_branches);
		
		Ayurvedic ayurvedic = new Ayurvedic();
		ayurvedic.setPlace(place);
		ayurvedic.setRegistration_no(registration_no);
		ayurvedic.setName(name);
		ayurvedic.setTrustee_names(trustee_names);
		ayurvedic.setFoundation_year(foundation_year);
		ayurvedic.setBuilding_name(building_name);
		ayurvedic.setNo_of_branches(no_of_branches);
		ayurvedic.setBranches(branches);
		return ayurvedic;

	}

}

  