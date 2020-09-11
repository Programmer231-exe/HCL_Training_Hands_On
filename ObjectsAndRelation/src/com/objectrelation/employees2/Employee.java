package com.objectrelation.employees2;

import java.time.LocalDate;

public class Employee {
	private int employee_code;
	private String employee_name;
	private LocalDate birth_date;
	private Department deptObj;
	public Department getDeptObj() {
		return deptObj;
	}
	public void setDeptObj(Department deptObj) {
		this.deptObj = deptObj;
	}


	private String designation;
	private int salary;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmployee_code() {
		return employee_code;
	}
	public void setEmployee_code(int employee_code) {
		this.employee_code = employee_code;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public LocalDate getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(LocalDate birth_date) {
		this.birth_date = birth_date;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Employee(int employee_code, String employee_name, LocalDate birth_date,
			String designation, int salary) {
		super();
		this.employee_code = employee_code;
		this.employee_name = employee_name;
		this.birth_date = birth_date;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String wishBirthday() {
		
		LocalDate date = LocalDate.now();
		
		if(this.getBirth_date().getMonth() == date.getMonth() && this.getBirth_date().getDayOfMonth() == date.getDayOfMonth()) {
			return "Happy Birthday " + this.getEmployee_name();
		}else {
			return null;
		}
	}
	
	public static int countPeople(Employee[] employees, String dept_code) {
		int count = 0;
		for(Employee employee : employees) {
			if(employee.getDeptObj().getDept_code().equals(dept_code))
				count = count + 1;
		}
		
		return count;
	}
	
	public static Employee allot_dept(Employee employee, String dept_code) {
		Department department = new Department();
		department.setDept_code(dept_code);
		employee.setDeptObj(department);
		return employee;
	}
	
}
