package com.devops.tony_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main application class for the Tony API.
 * This class serves as the entry point for the Spring Boot application.
 */
@SpringBootApplication
public class TonyApiApplication {

	/**
	 * The main method that starts the Spring Boot application.
	 *
	 * @param args command-line arguments passed during application startup
	 */
	public static void main(String[] args) {
		SpringApplication.run(TonyApiApplication.class, args);
	}

}
