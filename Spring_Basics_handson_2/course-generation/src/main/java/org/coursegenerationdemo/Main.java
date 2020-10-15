package org.coursegenerationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		Course course1 = appContext.getBean("course1",Course.class);
		Course course2 = appContext.getBean("course2",Course.class);
		Course course3 = appContext.getBean("course3",Course.class);
		course1.display();
		course2.display();
		course3.display();
		((ClassPathXmlApplicationContext)appContext).close();
	}
}
