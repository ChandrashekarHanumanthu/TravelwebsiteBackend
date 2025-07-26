# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy your entire project
COPY . .

# Build the project
RUN ./mvnw package -DskipTests

# Expose the port Spring Boot runs on
EXPOSE 8080

# Run the Spring Boot JAR
CMD ["java", "-jar", "target/*.jar"]
