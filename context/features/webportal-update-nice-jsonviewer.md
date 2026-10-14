# Update Specification: Add nice json display for the result returned by the REST service calls.

## Overview
This update involves adding a nice JSON viewer when showing the returned result of hte REST service call. Update the existing structure for the already two present buttons. Check the MainView.java first to scan for the current buttons. When the response is shown in the not error case show this as a nice JSON viewer.

## Technologies
- **Vaadin**: v25.3.0
- **Spring Boot**: v3.2.5

## Features
1. **Responsive Design**: The UI is responsive and works on different screen sizes.
3. **JSON result display**: Show the return JSON in a nice way..
4. **Main View**: Update the MainView.java to show the response json fomratted string in a nice way.

## Setup Instructions
### Prerequisites
- Java JDK 21 or later
- Maven 3.6.3 or later

### Installation
1. Build the project:
   ```sh
   mvn clean install
   ```

2. Run the application:
   ```sh
   mvn spring-boot:run
   ```

3. Open your browser and navigate to:
   ```sh
   http://localhost:8080
   ```

## Project Structure
```
hello-world-demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── CallController.java
│   │   │           ├── MainView.java
│   │   │           └── WebPortalApplication.java
│   │   └── resources/
│   │       └── application.properties
└── pom.xml

```

## Implementation Details
### Backend
- **Spring Boot**: Handles HTTP requests and serves the frontend.
- **Controller**: `CallController` serves the greeting message.

### Frontend
- **Vaadin**: Provides the UI components and handles user interactions.
- **MainView**: The main view that displays the greeting message and the buttons to call the services.

## Changes
- Read the existing MainView.java file to understand its current structure and components.
- Update the MainView.java file to include the JsonViewer component and modify the button click handlers to use the JsonViewer for displaying the response.
- Ensure that the updated MainView.java file maintains the existing functionality while adding the new JSON viewer feature.
- Do not remove the error handling.
- Do not remove the error dialog.
- Only change the response display in the succes case.
