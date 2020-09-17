package com.hcltrainings.collectionsdemo.calllogdemo;

import java.time.LocalDate;

public class CallLog {
	private String name;
	private String dialledNumber;
	private int duration;
	private LocalDate dialledDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDialledNumber() {
		return dialledNumber;
	}
	public void setDialledNumber(String dialledNumber) {
		this.dialledNumber = dialledNumber;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public LocalDate getDialledDate() {
		return dialledDate;
	}
	public void setDialledDate(LocalDate dialledDate) {
		this.dialledDate = dialledDate;
	}
	public CallLog(String name, String dialledNumber, int duration, LocalDate dialledDate) {
		super();
		this.name = name;
		this.dialledNumber = dialledNumber;
		this.duration = duration;
		this.dialledDate = dialledDate;
	}
	public CallLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
