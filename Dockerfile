# Use a base image with JDK and Maven pre-installed
FROM openjdk:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/interviewprep.jar app.jar

# Expose the port that your Spring Boot application uses (default is 8080)
EXPOSE 8080

# Specify the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]
