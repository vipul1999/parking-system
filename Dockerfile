# Stage 1: Build the application
FROM gradle:7.5.0-jdk17-alpine as build

WORKDIR /app

# Copy only the necessary files for the build
COPY build.gradle settings.gradle gradlew /app/
COPY gradle /app/gradle
RUN chmod +x ./gradlew

# Download dependencies without running the entire build
RUN ./gradlew dependencies

# Copy the source files
COPY src /app/src

# Build the application
RUN ./gradlew bootJar

# Stage 2: Runtime
FROM openjdk:17-alpine

WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/build/libs/parking-system-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application uses (default is 8080)
EXPOSE 8080

# Specify the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]
