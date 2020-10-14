package org.courserecommender.pojo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext courseContext = new AnnotationConfigApplicationContext(ConfigurerJava.class);
		
		Owner owner = courseContext.getBean("owner",Owner.class);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name password and mobile number");
		try {
			String name = br.readLine();
			String password = br.readLine();
			String mobileNumber = br.readLine();
			owner.setName(name);
			owner.setPassword(password);
			owner.setMobileNumber(mobileNumber);
			owner.display();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!= null) {
				try {
					br.close();
				} catch (IOException e) {
					br = null;
				}
			}
			owner = null;
			((AnnotationConfigApplicationContext)courseContext).close();
		}
		
		
		
		
		
	}
}
