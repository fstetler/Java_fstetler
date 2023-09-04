package com.example.springLearning;

import com.example.springLearning.model.NavigationComputer;
import com.example.springLearning.service.TractorbeamService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringLearningApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringLearningApplication.class, args);

		NavigationComputer navigationComputer = context.getBean(NavigationComputer.class);
		System.out.println(navigationComputer.navigate());

	}

}
