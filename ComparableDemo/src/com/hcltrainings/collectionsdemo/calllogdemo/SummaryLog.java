package com.hcltrainings.collectionsdemo.calllogdemo;

public class SummaryLog implements Comparable<Object>{
	private String name;
	private String dialledNumber;
	private int totalDuration;
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
	public int getTotalDuration() {
		return totalDuration;
	}
	public void setTotalDuration(int totalDuration) {
		this.totalDuration = totalDuration;
	}
	public SummaryLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SummaryLog(String name, String dialledNumber, int totalDuration) {
		super();
		this.name = name;
		this.dialledNumber = dialledNumber;
		this.totalDuration = totalDuration;
	}
	
	@Override
	public int compareTo(Object obj) {
		SummaryLog slog = (SummaryLog)obj;
		if(this.getTotalDuration() > slog.getTotalDuration())
			return -1;
		else if(this.getTotalDuration() < slog.getTotalDuration())
			return 1;
		else 
			return 0;
	}
	
	public void display() {
		System.out.format("\n%-20s %-20s %-20s", this.getName(),"(+91-" + this.getDialledNumber() + ")",this.getTotalDuration() + " Seconds" );
	}
}
