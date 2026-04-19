# testing-agent

**Branch: feature/feature-1**

Java Spring Boot microservice with minimal structure.

## Description
This repository contains a Java Spring Boot microservice template with minimal structure following git-based-workflow branching strategy.

## Branching Strategy
- **main**: Production-ready code and documentation
- **dev**: Development integration branch
- **feature/***: Feature development branches

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.8+

### Running the Application
```bash
# Clone the repository
git clone https://github.com/kunbisht/testing-agent.git
cd testing-agent
git checkout feature/feature-1

# Build and run
mvn clean install
mvn spring-boot:run
```

### API Endpoints
- `GET /api/health` - Health check endpoint
- `GET /api/hello` - Simple hello world endpoint

## Technology Stack
- **Language**: Java
- **Framework**: Spring Boot
- **Build Tool**: Maven
- **Template Type**: Microservice
- **Structure Size**: Minimal

## Repository Structure
```
/
├── README.md
├── .gitignore
├── LICENSE
├── CHANGELOG.md
├── CODE_OF_CONDUCT.md
├── CONTRIBUTING.md
├── SECURITY.md
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── testingagent/
│   │   │               ├── TestingAgentApplication.java
│   │   │               └── controller/
│   │   │                   └── HelloController.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── testingagent/
│                       └── TestingAgentApplicationTests.java
└── docs/
    └── api.md
```

## License
See LICENSE file for details.