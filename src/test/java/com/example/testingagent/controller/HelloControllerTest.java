package com.example.testingagent.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

/**
 * Unit tests for the HelloController class.
 * 
 * This class tests the REST endpoints to ensure they return the expected
 * responses and HTTP status codes.
 */
@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test the health endpoint returns OK status and expected fields.
     */
    @Test
    void testHealthEndpoint() throws Exception {
        mockMvc.perform(get("/api/health"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.status", is("UP")))
                .andExpect(jsonPath("$.service", is("testing-agent")))
                .andExpect(jsonPath("$.version", is("1.0.0-SNAPSHOT")))
                .andExpect(jsonPath("$.timestamp").exists());
    }

    /**
     * Test the hello endpoint returns OK status and expected message.
     */
    @Test
    void testHelloEndpoint() throws Exception {
        mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.message", is("Hello from Testing Agent Microservice!")))
                .andExpect(jsonPath("$.timestamp").exists());
    }
}