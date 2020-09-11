package com.mutualFund;

public class HDFC implements MutualFund {
	private double amount;
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

	public HDFC(double amount, int duration) {
		super();
		this.amount = amount;
		this.duration = duration;
	}

	public void amount() {
		double amount = this.getAmount();
		double duration = (double) this.getDuration();
		double mfReturns = amount * 0.49 * duration;
		System.out.print("You will hava returns as - " + mfReturns + " /- In ");
	}

	public void duration() {
		System.out.print(" " + this.getDuration()+" years");
	}
}
