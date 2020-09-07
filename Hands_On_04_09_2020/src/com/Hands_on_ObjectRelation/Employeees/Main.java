package com.Hands_on_ObjectRelation.Employeees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	
	private static Employee[] getEmpData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int employee_code;
		char[] employee_name;
		LocalDate birth_date;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
		char[] dept_code = new char[2];
		char[] designation;
		int salary;
		String EmployeeDetails;
		String[] EmployeeDetail;
		Employee[] employees = new Employee[5];
		System.out.println("Enter the Employee Details As Comma Separated Values:(Employee code,Employee Name, BirthDate,Dept_code,designation,salary ");
		for(int i = 0; i < 5; i++) {
			EmployeeDetails = br.readLine();
			EmployeeDetail = EmployeeDetails.split(",");
			employee_code = Integer.parseInt(EmployeeDetail[0]);
			employee_name = EmployeeDetail[1].toCharArray();
			birth_date = LocalDate.parse(EmployeeDetail[2], formatter);
			dept_code = EmployeeDetail[3].toCharArray();
			designation = EmployeeDetail[4].toCharArray();
			salary = Integer.parseInt(EmployeeDetail[5]);
			employees[i] = new Employee(employee_code, employee_name, birth_date, dept_code, designation,salary);
		}
		
		return employees;
	}
	
	private static void checkBirthday(Employee[] employees) {
		for(Employee employee: employees) {
			if(employee.wishBirthday() != null)
				System.out.println(employee.wishBirthday());
			
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		Employee[] employees = getEmpData();
		System.out.println();
		checkBirthday(employees);
	}
}
