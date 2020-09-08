package com.inheritance.case1;

public class Engineering extends HLCollege{
	private String building_name;
	private int no_of_branches; 
	private Branches[] branches;
	public String getBuilding_name() {
		return building_name;
	}
	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}
	public int getNo_of_branches() {
		return no_of_branches;
	}
	public void setNo_of_branches(int no_of_branches) {
		this.no_of_branches = no_of_branches;
	}
	public Branches[] getBranches() {
		return branches;
	}
	public void setBranches(Branches[] branches) {
		this.branches = branches;
	}
	public Engineering(String registration_no, String name, String place, String trustee_names, int foundation_year,
			String building_name, int no_of_branches, Branches[] branches) {
		super(registration_no, name, place, trustee_names, foundation_year);
		this.building_name = building_name;
		this.no_of_branches = no_of_branches;
		this.branches = branches;
	}
	public Engineering() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engineering(String registration_no, String name, String place, String trustee_names, int foundation_year) {
		super(registration_no, name, place, trustee_names, foundation_year);
		// TODO Auto-generated constructor stub
	}
	
	
	public void showBranchDetails() {
		Branches[] branches = this.getBranches();
		System.out.format("%-20s %-20s %-20s %-20s" , "Branch Name","Seats","Fees","Department Head");
		
		for(Branches branch : branches) {
			System.out.format("%-20s %-20d %-20f %-20s", branch.getName(),branch.getSeats(),branch.getFees(),branch.getDepartment_head());
		}
		
		
	}
	
}
