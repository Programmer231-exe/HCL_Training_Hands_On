package org.courserecommender.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurerJava {

	@Bean(name = "owner")
	public Owner getOwner() {
		return new Owner();
	}
}
