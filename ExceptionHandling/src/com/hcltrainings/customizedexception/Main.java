package com.hcltrainings.customizedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<EventType> eventTypeList = new ArrayList<EventType>();
		eventTypeList.add(new EventType(1,"Stage Event"));
		eventTypeList.add(new EventType(2,"Exhibition"));
		eventTypeList.add(new EventType(3,"Sports Meet"));
		Event[] events = createEvents(eventTypeList);
		System.out.format("\n%-15s %-15s %-15s %-15s","Name","Details","Owner Name","Event Type Id");
		for(Event event: events) {
			System.out.format("\n%-15s %-15s %-15s %-15s",event.getName(),event.getDetail(),event.getOwnerName(),event.getTypeId());
		}
	}
	
	public static boolean isValid(Long typeid,List<EventType> typeList) throws Exception {
		
		boolean isValidId = false;
		for(EventType eventType : typeList) {
			if(typeid == eventType.getId()) {
				isValidId = true;
			}
		}if(isValidId == false) {
			throw new EventTypeDoesNotExistsException();
		}
		
		return isValidId;
	}
	
	
	private static Event[] createEvents(List<EventType> lists) {
		int count;
		Event[] events = null;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String data;
		String[] splittedData;
		try {
			System.out.println("Enter the number of Events : ");
			count = Integer.parseInt(br.readLine());
			events = new Event[count];
			for(int i = 0 ; i < count ; i++) {
				System.out.println("Enter the Details of Event " + (i+1));
				data = br.readLine();
				splittedData = data.split(",");
				events[i] = new Event();
				events[i].setName(splittedData[0]);
				events[i].setDetail(splittedData[1]);
				events[i].setOwnerName(splittedData[2]);
		        boolean cond = true;
		        long id = Long.parseLong(splittedData[3]);
		        while(cond) {
		        	try {
		        		if(isValid(id,lists)) {
		        			events[i].setTypeId(id);
		        			cond = false;
		         		}
		        	}catch(EventTypeDoesNotExistsException etdnee) {
		        		System.out.println(etdnee);
		        		
		        		System.out.println("Enter the Correct Type Id: ");
		        		id = Long.parseLong(br.readLine());
		        	}catch(Exception e) {
		        		System.out.println(e);
		        	}
		        }
				
			}
			
			
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
		return events;
	}
}


