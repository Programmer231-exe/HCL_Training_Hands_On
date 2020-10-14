package org.courserecommender.pojo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		double budget = 0.0;
		ApplicationContext courseContext = new ClassPathXmlApplicationContext("appContext.xml");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Course course1 = courseContext.getBean("course1",Course.class);
		Course course2 = courseContext.getBean("course2",Course.class);
		Course course3 = courseContext.getBean("course3",Course.class);
		
		CourseList courselist = courseContext.getBean("courseList2",CourseList.class);
		courselist.insert(course1);
		courselist.insert(course2);
		courselist.insert(course3);
		
		
		
		System.out.println("Enter the Budget:");
		try {
			budget = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		//CourseList courselist = courseContext.getBean("courseList",CourseList.class);
		List<String> courseformybudget = courselist.noOfCourse(budget);
		
		for(String course : courseformybudget) {
			System.out.println(course);
		}
		
		
		((ClassPathXmlApplicationContext)courseContext).close();
		
	}
}
