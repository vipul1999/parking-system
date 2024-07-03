# Use a base image with JDK and Maven pre-installed
FROM openjdk:17-alpine

WORKDIR /app
# Copy the build files and Gradle wrapper
COPY . /app

RUN chmod +x ./gradlew

# Run Gradle to build the application
RUN ./gradlew bootJar

# Copy the built JAR file to a known location
RUN cp  build/libs/parking-system-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application uses (default is 8080)
EXPOSE 8080

# Specify the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]
