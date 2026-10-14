# EndpointController Documentation

---

## **Function Name**

*EndpointController provides REST endpoints for the Spring Boot Web Service.*

---

### **Synopsis**

```java
@RestController
public class EndpointController {
    @GetMapping("/")
    public String home() {
        // Returns the home page with links to other endpoints
    }

    @GetMapping("/Hello")
    public String hello() {
        // Returns the Hello World page with a button to redirect to the home page
    }

    @GetMapping("/GetDate")
    public ResponseEntity<String> getDate() {
        // Returns the current date in JSON format
    }
}
```

---

### **Description**

*This controller handles HTTP requests and provides responses for the Spring Boot Web Service.*

- **Input**: No direct input parameters. The endpoints are accessed via HTTP GET requests.
- **Output**:
  - `/`: Returns an HTML page with links to other endpoints.
  - `/Hello`: Returns an HTML page with a button to redirect to the home page.
  - `/GetDate`: Returns the current date in JSON format.
- **Notes**: The `/GetDate` endpoint uses `LocalDate.now()` to get the current date and returns it in a JSON response with an HTTP status code.

---

### **Example**

```java
// Example usage of the /GetDate endpoint
ResponseEntity<String> response = getDate();
System.out.println(response.getBody());
```

---

### **Implementation**

```java
@RestController
public class EndpointController {
    @GetMapping("/")
    public String home() {
        return "<html><body><h1>Welcome to the Spring Boot Web Service</h1><p><a href='/Hello'>Click here to see the Hello World page</a></p><p><a href='/GetDate'>Click here to get the current date</a></p></body></html>";
    }

    @GetMapping("/Hello")
    public String hello() {
        return "<html><body><h1>Hello World</h1><button onclick=\"window.location.href='/'\">Go Back Home</button></body></html>";
    }

    @GetMapping("/GetDate")
    public ResponseEntity<String> getDate() {
        LocalDate currentDate = LocalDate.now();
        String jsonResponse = String.format("{\"date\": \"%s\", \"code\": %d}", currentDate, HttpStatus.OK.value());
        return ResponseEntity.ok(jsonResponse);
    }
}
```

---

### **Exercises** *(Optional)*

1. *Add a new endpoint `/GetTime` that returns the current time in JSON format.*
2. *Modify the `/Hello` endpoint to include a button that redirects to the `/GetDate` endpoint.*

---

## Usage Instructions

1. Replace placeholders (e.g., `function_name`, `return_type`) with actual details.
2. Add or remove sections (e.g., **Exercises**) as needed.
3. Keep descriptions minimal and code-focused.

---

## Notes

- Follow the *K&R* style: **clear, concise, and code-first**.
- Use comments sparingly; let the code and examples speak for themselves.
- For libraries or modules, group related functions under a shared header.
