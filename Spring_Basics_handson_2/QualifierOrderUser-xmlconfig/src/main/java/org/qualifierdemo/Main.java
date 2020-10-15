package org.qualifierdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		User user = appContext.getBean("user",User.class);
		user.display();
		((ClassPathXmlApplicationContext)appContext).close();
		
	}

}
