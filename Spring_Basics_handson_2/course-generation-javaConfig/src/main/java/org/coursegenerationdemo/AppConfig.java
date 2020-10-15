package org.coursegenerationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

@Bean(name = "course1")
public Course getCourse1() {
	return new Course("Java","Sathish",10000);
}

@Bean(name = "course2")
public Course getCourse2() {
	return new Course("Selenium","Kanimozhi",2000);
}
@Bean(name = "course3")
public Course getCourse3() {
	return new Course("Python","Arun",500);
}
}
