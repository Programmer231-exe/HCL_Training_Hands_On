package com.hcltrainings.contextdemo.model;

import java.time.LocalDate;

public class Event {
	private String eventname;
	private String hallname;
	private Double price;
	private LocalDate date;
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	
	public Event(String eventname, String hallname, Double price, LocalDate date) {
		super();
		this.eventname = eventname;
		this.hallname = hallname;
		this.price = price;
		this.date = date;
	}
	public String getHallname() {
		return hallname;
	}
	public void setHallname(String hallname) {
		this.hallname = hallname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
}
