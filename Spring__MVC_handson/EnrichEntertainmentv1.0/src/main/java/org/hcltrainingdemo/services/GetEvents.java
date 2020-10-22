package org.hcltrainingdemo.services;

import java.util.List;

import org.hcltrainingdemo.dao.TodayEventsDAO;
import org.hcltrainingdemo.model.TodayEvents;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class GetEvents {
	private static ApplicationContext appContext;
	public static List<TodayEvents> getEvents(){
		appContext = new FileSystemXmlApplicationContext("C:\\Users\\s.sivasan\\workspace-sts-3.9.3\\EnrichEntertainment\\WebContent\\WEB-INF\\config\\dispatcher.xml");
		TodayEventsDAO dao = appContext.getBean("d",TodayEventsDAO.class);
		
		List<TodayEvents> lists = dao.getEvents();
		
		for(TodayEvents event : lists) {
			System.out.println(event.getEventName());
		}

		((FileSystemXmlApplicationContext)appContext).close();
		return lists;
	}
	
	

}
