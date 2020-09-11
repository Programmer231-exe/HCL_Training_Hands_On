package com.hcltrainings.customizedexception;

public class EventType {
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EventType(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public EventType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "\n"+
				"\nEvent Details:" +
				"\nEvent Id : " + this.getId() + 
				"\nEvent Name : " + this.getName();
	}
	
	

}
