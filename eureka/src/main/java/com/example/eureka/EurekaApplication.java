package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}

//eureka server is actually server who registers all the micro-services in it
// it like a attendance to the microservices or other services
///Eureka Server is a service registry that keeps track of all microservices and helps them discover and
///communicate with each other without hardcoding IP addresses or ports.

