FROM balenalib/raspberry-pi-debian-openjdk:latest

LABEL maintainer="archfox"
EXPOSE 8080

# Copy your jar file into the container
ADD target/Tricorder.jar /app/app.jar

# Command to run your Java application
CMD ["java", "-jar", "/app/app.jar"]
