FROM openjdk:17

# Set the working directory
WORKDIR /tony-api

# Copy the JAR file into the container
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose the port the app runs on
EXPOSE 3050

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]