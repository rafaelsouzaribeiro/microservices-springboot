package com.example.testes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestesApplication.class, args);
	}

}
