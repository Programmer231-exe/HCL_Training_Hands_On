package com.abstract_class_introduction.case2;

public class StageEvent extends Event {
	private int noOfShows;
	private int noOfSeatsPerShow;
	public int getNoOfShows() {
		return noOfShows;
	}

	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}
	
	
	
	public StageEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StageEvent(int noOfShows, int noOfSeatsPerShow) {
		super();
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public StageEvent(String name, String detail, String ownerName, int noOfShows, int noOfSeatsPerShow) {
		super.name = name;
		super.detail = detail;
		super.ownerName = ownerName;
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	
	
	@Override
	public double projectedRevenue() {
		return this.getNoOfShows() * this.getNoOfSeatsPerShow() * 50;
	}
}
