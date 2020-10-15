package org.courserecommender.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext courseContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		//Course course1 = courseContext.getBean("coursee",Course.class);
		//Course course2 = courseContext.getBean("coursee",Course.class);
		//Course course3 = courseContext.getBean("coursee",Course.class);
		
		Course course1 = courseContext.getBean(Course.class);
		Course course2 = courseContext.getBean(Course.class);
		Course course3 = courseContext.getBean(Course.class);
		course1.setDetails("Java","Senthil",1000);
		course2.setDetails("Selenium","Senthil",2000);
		course3.setDetails("Python","Senthil",500);
		
		CourseList courselist = courseContext.getBean(CourseList.class);
		courselist.insert(course1);
		courselist.insert(course2);
		courselist.insert(course3);
		
		courselist.display();
		
		System.out.println("Total Revenue : " + courselist.revenue());
		
		course1 = null;
		course2 = null;
		course3 = null;
		//CourseList courselist = courseContext.getBean("courseList",CourseList.class);
		//System.out.println("Total Revenue : " + courselist.revenue());
		
		
		((ClassPathXmlApplicationContext)courseContext).close();
		
	}
}
