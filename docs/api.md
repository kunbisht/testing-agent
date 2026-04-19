# API Documentation

## Testing Agent Microservice API

This document describes the REST API endpoints available in the Testing Agent microservice.

### Base URL
```
http://localhost:8080/api
```

### Endpoints

#### Health Check

**GET** `/api/health`

Returns the health status of the microservice.

**Response:**
```json
{
  "status": "UP",
  "timestamp": "2024-01-01T10:00:00",
  "service": "testing-agent",
  "version": "1.0.0-SNAPSHOT"
}
```

**Status Codes:**
- `200 OK` - Service is healthy

#### Hello World

**GET** `/api/hello`

Returns a simple greeting message.

**Response:**
```json
{
  "message": "Hello from Testing Agent Microservice!",
  "timestamp": "2024-01-01T10:00:00"
}
```

**Status Codes:**
- `200 OK` - Request successful

### Error Responses

All endpoints may return the following error responses:

**404 Not Found**
```json
{
  "timestamp": "2024-01-01T10:00:00",
  "status": 404,
  "error": "Not Found",
  "path": "/api/nonexistent"
}
```

**500 Internal Server Error**
```json
{
  "timestamp": "2024-01-01T10:00:00",
  "status": 500,
  "error": "Internal Server Error",
  "path": "/api/endpoint"
}
```

### Testing

You can test the endpoints using curl:

```bash
# Health check
curl -X GET http://localhost:8080/api/health

# Hello endpoint
curl -X GET http://localhost:8080/api/hello
```

### Actuator Endpoints

The application also exposes Spring Boot Actuator endpoints:

- `/actuator/health` - Detailed health information
- `/actuator/info` - Application information
- `/actuator/metrics` - Application metrics

### Development

For development, the application runs on port `8081` when using the `dev` profile:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```