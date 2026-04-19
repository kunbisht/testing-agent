package com.example.testingagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple REST controller providing basic endpoints for the microservice.
 * 
 * This controller demonstrates minimal functionality with health check
 * and hello world endpoints.
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    /**
     * Health check endpoint to verify the service is running.
     * 
     * @return ResponseEntity with health status and timestamp
     */
    @GetMapping("/health")
    public ResponseEntity&lt;Map&lt;String, Object&gt;&gt; health() {
        Map&lt;String, Object&gt; response = new HashMap&lt;&gt;();
        response.put("status", "UP");
        response.put("timestamp", LocalDateTime.now());
        response.put("service", "testing-agent");
        response.put("version", "1.0.0-SNAPSHOT");
        
        return ResponseEntity.ok(response);
    }

    /**
     * Simple hello world endpoint.
     * 
     * @return ResponseEntity with greeting message
     */
    @GetMapping("/hello")
    public ResponseEntity&lt;Map&lt;String, String&gt;&gt; hello() {
        Map&lt;String, String&gt; response = new HashMap&lt;&gt;();
        response.put("message", "Hello from Testing Agent Microservice!");
        response.put("timestamp", LocalDateTime.now().toString());
        
        return ResponseEntity.ok(response);
    }
}