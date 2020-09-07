package com.Hands_on_ObjectRelation.Employees_2;

public class Department {
	
	private String dept_code;
	private char[] Dept_name = new char[25];
	
	public Department(String dept_code, char[] dept_name) {
		super();
		this.dept_code = dept_code;
		Dept_name = dept_name;
	}

	public String getDept_code() {
		return dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	public char[] getDept_name() {
		return Dept_name;
	}

	public void setDept_name(char[] dept_name) {
		Dept_name = dept_name;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public void displayDepartmentDetails() {
		System.out.println("\n" +
						   "\nDepartment Code : " + this.getDept_code() +
						   "\nDepartment Name : " + String.valueOf(this.getDept_name()) +
						   "");
	}

}
