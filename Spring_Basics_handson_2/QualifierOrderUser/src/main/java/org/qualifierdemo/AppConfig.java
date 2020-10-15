package org.qualifierdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("order1")
	public Order gerOrder1() {
		return new Order("item1",230.07);
	}
	
	
	  @Bean("order2") public Order gerOrder2() { return new Order("item2",430.07);
	  }
	 
	
	@Bean("user")
	public User getUser() {
		User user = new User();
		user.setAge(25);
		user.setName("Ram");
		user.setCity("Chennai");
		return user;
	}
}

