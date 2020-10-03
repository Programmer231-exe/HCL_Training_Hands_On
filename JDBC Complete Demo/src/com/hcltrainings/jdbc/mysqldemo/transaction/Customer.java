package com.hcltrainings.jdbc.mysqldemo.transaction;

import java.time.LocalDate;

public class Customer {
	private int cust_id;
	private String name;
	private LocalDate dob;
	private double loan_amount;
	private double pending_due;
	private double monthly_due;
	private String contact_no;
	
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}

	public double getPending_due() {
		return pending_due;
	}

	public void setPending_due(double pending_due) {
		this.pending_due = pending_due;
	}

	public double getMonthly_due() {
		return monthly_due;
	}

	public void setMonthly_due(double monthly_due) {
		this.monthly_due = monthly_due;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public Customer(int cust_id, String name, LocalDate dob, double loan_amount, double pending_due, double monthly_due,
			String contact_no) {
		super();
		this.cust_id = cust_id;
		this.name = name;
		this.dob = dob;
		this.loan_amount = loan_amount;
		this.pending_due = pending_due;
		this.monthly_due = monthly_due;
		this.contact_no = contact_no;
	}
	
	
	
}
