package com.it2022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication

@EnableJpaAuditing
public class GestorApiAgenda2022Application {

	public static void main(String[] args) {
		SpringApplication.run(GestorApiAgenda2022Application.class, args);
	}

}
