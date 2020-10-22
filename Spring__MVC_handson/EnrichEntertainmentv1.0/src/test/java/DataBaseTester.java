
import java.util.List;

import org.hcltrainingdemo.dao.TodayEventsDAO;
import org.hcltrainingdemo.model.TodayEvents;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataBaseTester {
	public static void main(String[] args) throws Exception {
		
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("C:\\Users\\s.sivasan\\workspace-sts-3.9.3\\EnrichEntertainment\\WebContent\\WEB-INF\\config\\dispatcher.xml");
		
		DriverManagerDataSource dataSource = appContext.getBean(DriverManagerDataSource.class);
		
		System.out.println(dataSource.getUrl());
		System.out.println(dataSource.getPassword());
		
		TodayEventsDAO dao = appContext.getBean("d",TodayEventsDAO.class);
		
		List<TodayEvents> lists = dao.getEvents();
		
		for(TodayEvents event : lists) {
			System.out.println(event.getEventName());
		}
	
		
		((FileSystemXmlApplicationContext)appContext).close();
		
	}
}
