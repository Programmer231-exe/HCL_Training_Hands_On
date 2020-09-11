package com.hcltrainings.abstractclass.case4;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		Engineering engineering = getEngineeringDetails();
		Medical medical = getMedicalDetails();
		
		engineering.showBranchDetails();
		
		medical.showBranchDetails();
		medical.getInternshipInfo();
		
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
		
		return new Engineering(registration_no,place,name,trustee_names,foundation_year,building_name,no_of_branches,branches);
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
		boolean isAttachedHospital = HLCollegeService.getHospitalAttached();
		Branches[] branches = HLCollegeService.declareBranches(no_of_branches);
		
		return new Medical(registration_no,place,name,trustee_names,foundation_year,building_name,no_of_branches,isAttachedHospital,branches);
	}
}
