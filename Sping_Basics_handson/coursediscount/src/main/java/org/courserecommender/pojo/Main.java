package org.courserecommender.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext courseContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		
		CourseList courselist = courseContext.getBean("courseList",CourseList.class);
		courselist.discount();
		
		
		((ClassPathXmlApplicationContext)courseContext).close();
		
	}
}
