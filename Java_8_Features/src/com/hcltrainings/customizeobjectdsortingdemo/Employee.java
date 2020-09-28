package com.hcltrainings.customizeobjectdsortingdemo;

public class Employee {
	private int eno;
	private String ename;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	public String toString() {
		return eno+":"+ename;
	}
}
