package org.collectionsdemo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("plainemployee")
public class Employee {
	private String employeeName;
	private long employeeMobileNumber;
	private long employeeSalary;
	private String employeeEmail;
	
	@Autowired
	private Address address1;
	public String getEmployeeName() {
		return employeeName;
	}
	
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public long getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	
	public void setEmployeeMobileNumber(long employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	
	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	
	public long getEmployeeSalary() {
		return employeeSalary;
	}
	
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Address getAddress() {
		return address1;
	}
	public void setAddress(Address address) {
		this.address1 = address;
	}
	public Employee(String employeeName,long employeeMobileNumber, long employeeSalary, String employeeEmail,
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
