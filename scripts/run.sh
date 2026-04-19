#!/bin/bash

# Run script for Testing Agent microservice
# This script handles running the application with different profiles

set -e  # Exit on any error

echo "=== Testing Agent Run Script ==="

# Default values
PROFILE="default"
PORT="8080"
JAR_FILE="target/testing-agent-1.0.0-SNAPSHOT.jar"

# Parse command line arguments
while [[ $# -gt 0 ]]; do
    case $1 in
        --profile)
            PROFILE="$2"
            shift 2
            ;;
        --port)
            PORT="$2"
            shift 2
            ;;
        --help)
            echo "Usage: $0 [OPTIONS]"
            echo "Options:"
            echo "  --profile PROFILE   Set Spring profile (default, dev, prod)"
            echo "  --port PORT         Set server port (default: 8080)"
            echo "  --help              Show this help message"
            exit 0
            ;;
        *)
            echo "Unknown option: $1"
            echo "Use --help for usage information"
            exit 1
            ;;
    esac
done

# Check if JAR file exists
if [ ! -f "$JAR_FILE" ]; then
    echo "JAR file not found: $JAR_FILE"
    echo "Please run the build script first: ./scripts/build.sh"
    exit 1
fi

# Set port based on profile if not explicitly set
if [ "$PROFILE" = "dev" ] &amp;&amp; [ "$PORT" = "8080" ]; then
    PORT="8081"
fi

echo "Starting Testing Agent microservice..."
echo "Profile: $PROFILE"
echo "Port: $PORT"
echo "JAR: $JAR_FILE"
echo ""

# Build Java command
JAVA_OPTS="-Xmx512m -Xms256m"
SPRING_OPTS="--spring.profiles.active=$PROFILE --server.port=$PORT"

echo "Java options: $JAVA_OPTS"
echo "Spring options: $SPRING_OPTS"
echo ""
echo "Application will be available at: http://localhost:$PORT"
echo "Health check: http://localhost:$PORT/api/health"
echo "Hello endpoint: http://localhost:$PORT/api/hello"
echo ""
echo "Press Ctrl+C to stop the application"
echo "======================================"

# Run the application
java $JAVA_OPTS -jar "$JAR_FILE" $SPRING_OPTS