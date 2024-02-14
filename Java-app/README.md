# Containerize the Java Application

## Java Code

```java
import java.util.Scanner;

public class GreetApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a greeting using the entered name
        System.out.println("Hello, " + name + "! Welcome to the Greeting App.");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
```
## Compile the code
```java
javac GreetApp.java 
```
## Run the  code to test it manually
```java
java GreetApp
```
![image](https://github.com/Bhupendra-Maurya/Docker-Projects/assets/114428614/900c706f-ed7f-437b-8f28-5045dd97cd8a)



#  Create the Dockerfile
```
## Use the official OpenJDK 11 base image from Docker Hub
FROM openjdk:11

## Set the working directory inside the container to /app
WORKDIR /app

## Copy the GreetApp.java file from the build context to /app in the container
COPY GreetApp.java /app

## Compile the Greet.java file inside the container using the javac command
RUN javac GreetApp.java

## Specify the default command to run when the container starts
CMD ["java", "GreetApp"]
```
# Build the Dockerfile --- to create the `image`
```Dockerfile
docker build -t java-app:latest .
```
![image](https://github.com/Bhupendra-Maurya/Docker-Projects/assets/114428614/bb194b91-222c-4931-9ace-7a63b269387a)

### To see the image
```Dockerfile
docker images
```

# Run the image --- to create the `container`
```Dockerfile
docker run -i  java-app:latest
```
### To see the container
```Dockerfile
docker container ps
docker container ps -a
```
#### If you face this error 
![image](https://github.com/Bhupendra-Maurya/Docker-Projects/assets/114428614/b89a72cf-a7b9-4b91-8336-780c4047100f)
#### Just run your container in interactive mode
