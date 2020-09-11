package com.hcltrainings.abstractclass.case4;

public class Medical extends HLCollege{
	private String building_name;
	private int no_of_branches;
	private boolean attached_hospital;

	public Branches[] getBranches() {
		return branches;
	}

	public void setBranches(Branches[] branches) {
		this.branches = branches;
	}

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

	public boolean isAttached_hospital() {
		return attached_hospital;
	}

	public void setAttached_hospital(boolean attached_hospital) {
		this.attached_hospital = attached_hospital;
	}

	public Medical() {
		super();
	}
	public Medical(String registration_no, String name, String place, String trustee_names, int foundation_year,
			String building_name, int no_of_branches,boolean attached_hospital, Branches[] branches) {
		super(registration_no, name, place, trustee_names, foundation_year);
		this.building_name = building_name;
		this.no_of_branches = no_of_branches;
		this.attached_hospital = attached_hospital;
		this.branches = branches;
	}
	
	
	public void getInternshipInfo() {
		System.out.println("\n" + 
						   "\nInternship Details " +
						   "\n\tStudent passed with >90% in all semesters  -- Intership in Self College" +
						   "\n\tStudent passed with 80 - 90% in all semesters  -- Intership in City" + 
						   "\n\tStudent passed with 70 - 79% in all semesters  -- Intership in Villager near city");
		
	}
	
	public void showBranchDetails() {
		Branches[] branches = this.getBranches();
		
		System.out.println("\nMedical College Details: ");
		System.out.format("\n%-20s %-20s %-20s %-20s" , "Branch Name","Seats","Fees","Department Head");
		
		for(Branches branch : branches) {
			System.out.format("\n%-20s %-20d %-20f %-20s", branch.getName(),branch.getSeats(),branch.getFees(),branch.getDepartment_head());
		}
		
	}
	
}
