#!/bin/bash

# Build script for Testing Agent microservice
# This script handles building, testing, and packaging the application

set -e  # Exit on any error

echo "=== Testing Agent Build Script ==="
echo "Starting build process..."

# Check if Maven is installed
if ! command -v mvn &amp;&gt; /dev/null; then
    echo "Error: Maven is not installed or not in PATH"
    exit 1
fi

# Check if Java is installed
if ! command -v java &amp;&gt; /dev/null; then
    echo "Error: Java is not installed or not in PATH"
    exit 1
fi

# Display Java version
echo "Java version:"
java -version

# Display Maven version
echo "Maven version:"
mvn -version

# Clean previous builds
echo "Cleaning previous builds..."
mvn clean

# Compile the application
echo "Compiling application..."
mvn compile

# Run tests
echo "Running tests..."
mvn test

# Package the application
echo "Packaging application..."
mvn package -DskipTests

# Check if JAR file was created
if [ -f "target/testing-agent-1.0.0-SNAPSHOT.jar" ]; then
    echo "✅ Build successful! JAR file created: target/testing-agent-1.0.0-SNAPSHOT.jar"
    echo "File size: $(du -h target/testing-agent-1.0.0-SNAPSHOT.jar | cut -f1)"
else
    echo "❌ Build failed! JAR file not found."
    exit 1
fi

echo "=== Build completed successfully ==="
echo "To run the application: java -jar target/testing-agent-1.0.0-SNAPSHOT.jar"
echo "Or use: mvn spring-boot:run"