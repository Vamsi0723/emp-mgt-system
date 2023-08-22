# Use an official OpenJDK base image
FROM openjdk:8

# Copy the application JAR/WAR file from your local machine to the container
COPY target/emp-mgt-system-0.1-plain.jar emp-mgt-system-0.1-plain.jar

# Expose the port that your Spring Boot app runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "/emp-mgt-system-0.1-plain.jar"]