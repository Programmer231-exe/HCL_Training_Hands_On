 package com.hcltrainings.abstractclass.case4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HLCollegeService {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static String getPlace() throws IOException{
		String place;
		System.out.println("Enter the City of College:");
		place = br.readLine();
		return place;
	}
	
	public static String getRegno(String place) throws IOException{
		String regno;
		System.out.println("Enter the Registration Number ");
		regno = br.readLine();
		if(validateRegno(regno,place))
			return regno;
		else {
			System.err.println("Invalid Registration Number");
			System.exit(0);
		}
		
		return null;
	}
	
	private static boolean validateRegno(String regno, String place) {
		
		String pattern = "Mh" + place.substring(0,3);
		if(regno.startsWith(pattern)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static String getCollegeName() throws IOException {
		String collegeName;
		System.out.println("Enter College Name");
		collegeName = br.readLine();
		return collegeName;
		
	}
	
	public static String getTrusteeNames() throws IOException {
		String tname;
		System.out.println("Enter the Trustees Names");
		tname = br.readLine();
		return tname;
	}
	
	
	public static int getFoundationYear() throws IOException{
		int foundation_year;
		System.out.println("Enter the foundation Year");
		foundation_year = Integer.parseInt(br.readLine());
		return foundation_year;
	}
	
	public static String getBuildingName() throws IOException{
		String bname;
		System.out.println("Enter the Building Name: ");
		bname = br.readLine();
		return bname;
	}
	
	
	public static int getBranches() throws IOException {
		int no_of_branches;
		System.out.println("Enter the Number of Branches : ");
		no_of_branches= Integer.parseInt(br.readLine());
		return no_of_branches;
	}
	
	
	public static Branches[] declareBranches(int count) throws IOException {
		Branches[] branches = new Branches[count];
		String branchDetail;
		String[] splittedBranchDetail;
		String name;
		int seats;
		double fees;
		String departmentHead;
		System.out.println("Enter the Branches Details in Comma Separated Values (BranchName,Seats,fees,Department_head");
		for(int i = 0; i < count ; i++) {
			branchDetail = br.readLine();
			splittedBranchDetail = branchDetail.split(",");
			name = splittedBranchDetail[0];
			seats = Integer.parseInt(splittedBranchDetail[1]);
			fees = Double.parseDouble(splittedBranchDetail[2]);
			departmentHead = splittedBranchDetail[3];
			branches[i] = new Branches(name,seats,fees,departmentHead);
		}
		
		
		return branches;
		
	}

	public static boolean getHospitalAttached() throws IOException {
		String choice;
		System.out.println("College has Hospital?");
		choice = br.readLine();
		
		if(choice.equalsIgnoreCase("Yes"))
			return true;
		else
			return false;
	}
	
	
	

}
