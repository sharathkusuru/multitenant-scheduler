package com.demo.multitenant;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@ComponentScan("com.demo.multitenant.*")
public class MultiTenantApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(MultiTenantApplication.class, args);
	}

}
