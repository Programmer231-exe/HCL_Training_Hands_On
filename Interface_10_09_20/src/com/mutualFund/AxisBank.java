package com.mutualFund;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AxisBank implements MutualFund{
	public static final int INTEREST_RATE = 56;
	private double amount;
	private String name;
	private int duration;
	
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void amount() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amount you want to invest");
		try {
			this.setAmount(Double.parseDouble(br.readLine()));
		}catch(IOException ioe){
			System.err.println("Exception handled in the method");
			System.exit(0);
		}
	}
	
	public void duration() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amount you want to invest");
		try {
			this.setDuration(Integer.parseInt(br.readLine()));		
			}catch(IOException ioe){
			System.err.println("Exception handled in the method");
			System.exit(0);
		}
	}
	
	public double returns() {
		double mfReturns = this.getAmount() * (AxisBank.INTEREST_RATE/100) * this.getDuration();
		return mfReturns;
	}
	
	public int getTenurePeriod() {
		return this.getDuration();
	}
}
