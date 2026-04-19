package com.example.testingagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the Testing Agent microservice.
 * 
 * This is a minimal Spring Boot application that serves as a template
 * for a microservice with basic functionality.
 */
@SpringBootApplication
public class TestingAgentApplication {

    /**
     * Main method to start the Spring Boot application.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(TestingAgentApplication.class, args);
    }
}