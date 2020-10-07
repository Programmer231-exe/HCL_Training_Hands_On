package org.minitransaction.bank;

import java.time.LocalDate;

public class BankTransaction {
	
	private long cardNumber;
	private LocalDate transactionDate;
	private double amount;
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getAmount() {
		return amount;
	}
	public BankTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public BankTransaction(long cardNumber, LocalDate transactionDate, double amount) {
		super();
		this.cardNumber = cardNumber;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}
	
	

}
