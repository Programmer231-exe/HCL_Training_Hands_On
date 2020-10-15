package org.qualifierdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		User user = appContext.getBean("user",User.class);
		user.display();
		((AnnotationConfigApplicationContext)appContext).close();
	}

}
