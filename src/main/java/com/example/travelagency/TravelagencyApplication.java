package com.example.travelagency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.travelagency.repository")
@EntityScan("com.example.travelagency.entity")
public class TravelagencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelagencyApplication.class, args);
	}

}
