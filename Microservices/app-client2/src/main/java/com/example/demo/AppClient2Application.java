package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AppClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppClient2Application.class, args);
	}
}
