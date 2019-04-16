package com.dutra.remind.me.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RemindMeQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemindMeQueryApplication.class, args);
	}
}
