package com.hcltraining.contextdemo.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.hcltrainings.contextdemo.model.Event;

public class ContextService {
 
	private static DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static List<Event> getEvents(String filepath,LocalDate date){
		System.out.println("running");
		BufferedReader br = null;
		try {
			br= new BufferedReader(new FileReader(filepath));
			Stream<String> str = br.lines();
			List<Event> eventList = str.filter((si) -> LocalDate.parse(si.split(",")[3],fr).compareTo(date) == 0).map((si) ->{
				String[] details = si.split(",");
				System.out.println("This is working");
				return new Event(details[0],details[1],Double.parseDouble(details[2]),LocalDate.parse(details[3],fr));
			}).collect(Collectors.toList());
			
			return eventList;
		}catch(FileNotFoundException foe) {
			System.out.println(foe.getLocalizedMessage());
			return null;
			
			
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
}
