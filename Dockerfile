# Use Java 21
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy pre-built JAR
COPY target/chatApp-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "app.jar"]
