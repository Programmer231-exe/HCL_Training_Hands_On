package com.hcltrainings.customizedexception;

public class EventTypeDoesNotExistsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EventTypeDoesNotExistsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventTypeDoesNotExistsException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "EventTypeDoesNotExistsException: No evet type available with given id";
	}
}
