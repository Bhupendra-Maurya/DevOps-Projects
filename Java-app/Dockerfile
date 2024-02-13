# Use the official OpenJDK 11 base image from Docker Hub
FROM openjdk:11

# Set the working directory inside the container to /app
WORKDIR /app

# Copy the GreetApp.java file from the build context to /app in the container
COPY GreetApp.java /app

# Compile the Greet.java file inside the container using the javac command
RUN javac GreetApp.java

# Specify the default command to run when the container starts
CMD ["java", "GreetApp"]

