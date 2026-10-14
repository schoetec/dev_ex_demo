package com.example.webportal;

import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

@Component
public class CallController {
  private final RestTemplate restTemplate;

  public CallController(RestTemplate restTemplate) {
  this.restTemplate = restTemplate;
  }

  public String callHelloEndpoint() {
  try {
  String baseUrl = System.getenv("BASE_URL");
        return restTemplate.getForObject(baseUrl + "/Hello", String.class);
  } catch (RestClientException e) {
  return "Error: " + e.getMessage();
  }
  }

  public String callGetDateEndpoint() {
  try {
  String baseUrl = System.getenv("BASE_URL");
        return restTemplate.getForObject(baseUrl + "/GetDate", String.class);
  } catch (RestClientException e) {
  return "Error: " + e.getMessage();
  }
  }

}