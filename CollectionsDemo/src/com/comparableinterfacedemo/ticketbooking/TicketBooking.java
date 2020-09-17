package com.comparableinterfacedemo.ticketbooking;

public class TicketBooking implements Comparable<Object>{
	private String customerName;
	private int price;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public TicketBooking(String customerName, int price) {
		super();
		this.customerName = customerName;
		this.price = price;
	}
	public TicketBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Object obj) {
		TicketBooking tb1 = (TicketBooking)this;
		TicketBooking tb2 = (TicketBooking)obj;
		
		if(tb1.getPrice() > tb2.getPrice())
			return 1;
		else if(tb1.getPrice() < tb2.getPrice())
			return -1;
		else 
			return 0;
	}
	
	
}
