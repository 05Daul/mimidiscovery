package com.example.mimidiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MimidiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MimidiscoveryApplication.class, args);
	}

}
