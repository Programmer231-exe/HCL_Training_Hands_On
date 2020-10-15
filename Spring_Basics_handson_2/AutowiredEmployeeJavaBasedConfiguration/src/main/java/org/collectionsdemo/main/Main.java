package org.collectionsdemo.main;

import org.collectionsdemo.pojo.Employee;
import org.collectionsdemo.pojo.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		//ApplicationContext employeescontext = new ClassPathXmlApplicationContext("appContext.xml");
		ApplicationContext employeecontext = new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee employeee = employeecontext.getBean("plainemployee",Employee.class);
		//employeee.setAddress(employeecontext.getBean(Address.class));
		employeee.display();
		Employee employee = employeecontext.getBean("Manager",Employee.class);
		employee.display();
		Employee softwareEngineer = employeecontext.getBean("SoftwareEngineer",Employee.class);
		softwareEngineer.display();
		((AnnotationConfigApplicationContext)employeecontext).close();
	}

}
	