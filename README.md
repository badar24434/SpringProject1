
# Spring Boot Web Lab 6

## Running the Application

### Option 1: Using IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Navigate to `src/main/java/com/csc3402/lab/springproject1/DemoApplication.java`
3. Right-click on the file and select "Run 'DemoApplication.main()'"
4. Alternatively, click on the green play button next to the main method

### Option 2: Using Command Line with Maven Wrapper
1. Open a command prompt/terminal
2. Navigate to the project root directory:
   ```
   cd path/to/SpringProject1
   ```
3. Run the application using the Maven wrapper:
   - On Windows:
     ```
     mvnw.cmd spring-boot:run
     ```
   - On Unix-based systems:
     ```
     ./mvnw spring-boot:run
     ```

### Option 3: Using an Executable JAR
1. First, build the project:
   ```
   mvnw.cmd clean package
   ```
2. Then run the JAR:
   ```
   java -jar target/demo-0.0.1-SNAPSHOT.jar
   ```

## Accessing the Application

Once the application is running:
- Access the web application at: http://localhost:8080
- The application allows you to add and view messages through a web interface

## Available Endpoints
- Main application: http://localhost:8080
- Health check: http://localhost:8080/actuator/health
- Info: http://localhost:8080/actuator/info
- Metrics: http://localhost:8080/actuator/metrics

## Project Features
- Spring Boot web application with Thymeleaf templating
- Bootstrap UI
- Message form submission and display
- RESTful endpoint structure

