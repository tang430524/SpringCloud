package com.ty.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer    //表明为service client
@SpringBootApplication
public class ClientAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientAApplication.class, args);
	}
}
