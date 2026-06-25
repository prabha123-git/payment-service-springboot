# Base Image
FROM eclipse-temurin:17-jdk

# Working Directory inside container
WORKDIR /app

# Copy the executable JAR into the container
COPY target/*.jar app.jar

# Application listens on this port
EXPOSE 8081

# Start the application
ENTRYPOINT ["java","-jar","app.jar"]