package com.ngs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDiAutowireApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootDiAutowireApplication.class, args);
		Student s1=context.getBean(Student.class);
		s1.getStudent();
	}

}
