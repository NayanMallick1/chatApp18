# Use lightweight Java 21 image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy the pre-built JAR
COPY target/chatApp-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (Render will override if needed)
EXPOSE 8080

# Run the JAR
CMD ["java", "-jar", "app.jar"]
