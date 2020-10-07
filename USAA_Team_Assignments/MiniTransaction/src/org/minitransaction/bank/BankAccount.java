package org.minitransaction.bank;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BankAccount {
	private String name;
	private int age;
	private char gender;
	private String bank;
	private long cardNumber;
	private double creditLimit;
	private Map<String,List<BankTransaction>> banktrans = new TreeMap<>();

	
	public Map<String, List<BankTransaction>> getBanktrans() {
		return banktrans;
	}
	public void setBanktrans(Map<String, List<BankTransaction>> banktrans) {
		this.banktrans = banktrans;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
	}
	
	

