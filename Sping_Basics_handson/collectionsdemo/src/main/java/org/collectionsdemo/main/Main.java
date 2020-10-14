package org.collectionsdemo.main;

import org.collectionsdemo.pojo.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext employeescontext = new ClassPathXmlApplicationContext("appContext.xml");
		Employee employee = employeescontext.getBean("employee",Employee.class);
		employee.display();
		((ClassPathXmlApplicationContext)employeescontext).close();
	}

}
	