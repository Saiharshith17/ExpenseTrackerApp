# Use Amazon Corretto JDK 21 base image (no need to specify platform)
FROM amazoncorretto:21

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the host to the container
COPY app/build/libs/authservice-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that your Java service listens on
EXPOSE 9898

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
