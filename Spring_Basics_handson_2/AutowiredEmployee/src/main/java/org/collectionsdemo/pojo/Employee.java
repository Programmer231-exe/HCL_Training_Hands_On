package org.collectionsdemo.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	private String employeeName;
	private long employeeMobileNumber;
	private long employeeSalary;
	private String employeeEmail;
	private Address address1;
	public String getEmployeeName() {
		return employeeName;
	}
	
	@Value("Sathish")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public long getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	@Value("9566259957")
	public void setEmployeeMobileNumber(long employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	
	@Value("45000")
	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	
	public long getEmployeeSalary() {
		return employeeSalary;
	}
	
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	
	@Value("sathish@gmail.com")
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Address getAddress() {
		return address1;
	}
	public void setAddress(Address address) {
		this.address1 = address;
	}
	public Employee(String employeeName, int employeeMobileNumber, long employeeSalary, String employeeEmail,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeMobileNumber = employeeMobileNumber;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.address1 = address;
	}
	public Employee() {
		super();
		
	}
	
	public void display() {
		System.out.println("Name : " + this.getEmployeeName() +
							"\nMobile : " + this.getEmployeeMobileNumber() +
							"\nSalary : " + this.getEmployeeSalary() 
							);
		this.getAddress().display();
	}
	
	
}
