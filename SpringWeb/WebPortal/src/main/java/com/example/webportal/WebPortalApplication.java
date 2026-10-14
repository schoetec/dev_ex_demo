package com.example.webportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebPortalApplication extends SpringBootServletInitializer {
 public static void main(String[] args) {
 SpringApplication.run(WebPortalApplication.class, args);
 }


@Bean
public RestTemplate restTemplate() {
    return new RestTemplate();
}

 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
 return application.sources(WebPortalApplication.class);
 }
}