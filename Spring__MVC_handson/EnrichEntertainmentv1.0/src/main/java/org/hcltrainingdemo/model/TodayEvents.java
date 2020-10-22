package org.hcltrainingdemo.model;


public class TodayEvents {
	private int eventid;
	private String eventName;
	private String eventOrganizer;
	private String time;
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventOrganizer() {
		return eventOrganizer;
	}
	public void setEventOrganizer(String eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public TodayEvents(int eventid, String eventName, String eventOrganizer, String time) {
		super();
		this.eventid = eventid;
		this.eventName = eventName;
		this.eventOrganizer = eventOrganizer;
		this.time = time;
	}
	public TodayEvents() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
