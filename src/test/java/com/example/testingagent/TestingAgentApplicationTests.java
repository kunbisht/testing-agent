package com.example.testingagent;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Integration tests for the Testing Agent application.
 * 
 * This class contains basic tests to ensure the Spring Boot application
 * context loads correctly and the application starts without errors.
 */
@SpringBootTest
@ActiveProfiles("test")
class TestingAgentApplicationTests {

    /**
     * Test that the Spring application context loads successfully.
     * This is a basic smoke test to ensure the application configuration is valid.
     */
    @Test
    void contextLoads() {
        // This test will pass if the application context loads without errors
        // No additional assertions needed for this basic smoke test
    }
}