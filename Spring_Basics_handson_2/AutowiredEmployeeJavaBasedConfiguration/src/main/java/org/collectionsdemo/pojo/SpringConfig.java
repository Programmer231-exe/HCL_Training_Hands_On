package org.collectionsdemo.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.collectionsdemo.pojo"})
public class SpringConfig {
	
	/*
	 * @Bean(name = "MyEmployee") public Employee getEmployee() { return new
	 * Employee("Sivasankar",923948L,238749L,"sathish@gmail.com",getSEAddress()); }
	 */
	
	@Bean(name = "addressForSE")
	public Address getSEAddress() {
		return new Address("2/115 Anna Nagar","Kaveripattinam","Krishnagiri","635112");
	}
	
	@Bean(name = "SoftwareEngineer")
	public Employee getSoftwareEngineer() {
		return new Employee("Ramyaaaa",9566259957L,45000L,"ramya@gmail.com",getSEAddress());
	}
	
	@Bean(name = "Manager")
	public Employee getManager() {
		return new Employee("Ravi",2837492L,239723L,"ravi@gmail.com",getSEAddress());
	}
	
}
