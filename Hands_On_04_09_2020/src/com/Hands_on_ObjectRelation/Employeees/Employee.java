package com.Hands_on_ObjectRelation.Employeees;

import java.time.LocalDate;

public class Employee {
	private int employee_code;
	private char[] employee_name = new char[25];
	private LocalDate birth_date;
	private char[] dept_code = new char[2];
	private char[] designation = new char[20];
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
	public char[] getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(char[] employee_name) {
		this.employee_name = employee_name;
	}
	public LocalDate getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(LocalDate birth_date) {
		this.birth_date = birth_date;
	}
	public char[] getDept_code() {
		return dept_code;
	}
	public void setDept_code(char[] dept_code) {
		this.dept_code = dept_code;
	}
	public char[] getDesignation() {
		return designation;
	}
	public void setDesignation(char[] designation) {
		this.designation = designation;
	}
	public Employee(int employee_code,char[] employee_name, LocalDate birth_date, char[] dept_code,
			char[] designation,int salary) {
		super();
		this.employee_code = employee_code;
		this.employee_name = employee_name;
		this.birth_date = birth_date;
		this.dept_code = dept_code;
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
			return "Happy Birthday , " + String.valueOf(this.getEmployee_name());
		}else {
			return null;
		}
	}
	
}
