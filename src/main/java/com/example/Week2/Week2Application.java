package com.example.Week2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.Week2.Controllers","com.example.Week2.Services"})
public class Week2Application {

	public static void main(String[] args) {
		SpringApplication.run(Week2Application.class, args);

	}

}
