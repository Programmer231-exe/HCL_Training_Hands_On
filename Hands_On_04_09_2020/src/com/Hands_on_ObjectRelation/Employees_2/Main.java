package com.Hands_on_ObjectRelation.Employees_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	
	private static Employee[] getEmpData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int employee_code;
		String employee_name;
		LocalDate birth_date;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
		String dept_code;
		String designation;
		int salary;
		String EmployeeDetails;
		String[] EmployeeDetail;
		Employee[] employees = new Employee[5];
		System.out.println("Enter the Employee Details As Comma Separated Values:(Employee code,Employee Name, BirthDate,Dept_code,designation,salary ");
		for(int i = 0; i < 5; i++) {
			EmployeeDetails = br.readLine();
			EmployeeDetail = EmployeeDetails.split(",");
			employee_code = Integer.parseInt(EmployeeDetail[0]);
			employee_name = EmployeeDetail[1];
			birth_date = LocalDate.parse(EmployeeDetail[2], formatter);
			dept_code = EmployeeDetail[3];
			designation = EmployeeDetail[4];
			salary = Integer.parseInt(EmployeeDetail[5]);
			employees[i] = Employee.allot_dept(new Employee(employee_code, employee_name, birth_date,designation,salary), dept_code);
			
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
		
		String dept_code;
		Employee[] employees = getEmpData();
		checkBirthday(employees);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		System.out.println("Enter the Department Code : ");
		dept_code = br.readLine();
		
		System.out.println("Number of People in Department " + dept_code + " : " + 	
							Employee.countPeople(employees, dept_code));
	
		
	}
}
