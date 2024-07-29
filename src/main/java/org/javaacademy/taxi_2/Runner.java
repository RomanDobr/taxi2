package org.javaacademy.taxi_2;

import org.javaacademy.taxi_2.taxipark.TaxiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Runner {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);
		TaxiService taxiService = context.getBean(TaxiService.class);
		taxiService.init(context);
		context.close();
	}
}
