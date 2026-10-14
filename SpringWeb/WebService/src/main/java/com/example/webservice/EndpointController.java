package com.example.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.time.LocalDate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class EndpointController {

    @Operation(summary = "Home endpoint", description = "Returns a message indicating this is not a valid endpoint")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved message")
    })
    @GetMapping("/")
    public ResponseEntity<String> home() {
        String jsonResponse = "{\"data\": \"this is a not valid endpoint\"}";
        return ResponseEntity.ok(jsonResponse);
    }

    @Operation(summary = "Hello endpoint", description = "Returns a greeting message")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved greeting")
    })
    @GetMapping("/Hello")
    public ResponseEntity<String> hello() {
        String jsonResponse = "{\"data\": \"Hello World\"}";
        return ResponseEntity.ok(jsonResponse);
    }

    @Operation(summary = "Get current date", description = "Returns the current date and HTTP status code")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved date")
    })
    @GetMapping("/GetDate")
    public ResponseEntity<String> getDate() {
        LocalDate currentDate = LocalDate.now();
        String jsonResponse = String.format("{\"data\": {\"date\": \"%s\", \"code\": %d}}", currentDate, HttpStatus.OK.value());
        return ResponseEntity.ok(jsonResponse);
    }
}