package org.collectionsdemo.pojo;

import java.util.List;

public class Employee {
	private String employeeName;
	private List<String> employeeMobileNumber;
	private long employeeSalary;
	private String employeeEmail;
	private Address address;
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<String> getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}

	public void setEmployeeMobileNumber(List<String> employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}

	public long getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(String employeeName, List<String> employeeMobileNumber, long employeeSalary, String employeeEmail,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeMobileNumber = employeeMobileNumber;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("Name : " + this.getEmployeeName() );
		System.out.println("The Contact Number are ");
		for(String number : this.getEmployeeMobileNumber()) {
			System.out.println(number);
		}
		System.out.println("Salary :"  + this.getEmployeeSalary() + 
							"\nEmail : " + this.getEmployeeEmail());
		this.getAddress().display();
	}
}
