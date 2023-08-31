package com.example.springLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringLearningApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringLearningApplication.class, args);
	}

}
