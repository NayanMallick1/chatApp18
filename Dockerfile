# Step 1: Use Java 21 image
FROM openjdk:21-jdk-slim

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy Maven files and source code
COPY . .

# Step 4: Build the app inside the container
RUN ./mvnw clean package -DskipTests

# Step 5: Expose the default port (Render will override)
EXPOSE 8080

# Step 6: Run the JAR
CMD ["java", "-jar", "target/chatApp-0.0.1-SNAPSHOT.jar"]
