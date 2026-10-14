# Java + Spring Boot Setup

## Overview

Add new sub-project that contains a vaadin portal using spring boot as webservice.

## Requirements

- Use Java 
- Use Spring Boot 
- Use Vaadin v25.3.0
- Create a new webservice called WebPortal in the subfolder WebPortal. Create folder if needed.
- Use HTTP for now
- Generate maven build file for maven version 3.9.14 in the WebPortal folder.
- Generate windows powershell script to run the WebPortal jar
- The Web Service portal must run on port 8090
- The portal shows a Hello Wolrd caption.
- The portal shows two buttons:
    - One button when pressed calls via rest the `/Hello`endpoint of the webservice running on localhost port 8080.
    - One button when pressed calls via REST the `/GetDate` endpoint of a webservice running on localhost port 8080.
    - Use RestTemplate to make the rest calls.
    - Put the handling of the REST call in a sepperate class called CallController.
- Create a main maven pom file to build both in the top folder.
- Do not touch the other service called WebService only check this folder to add the project in the top-level maven pom.xml.


## References

- Initial data models: `@context/project-overview.md`
- Database standards: `@context/coding-standards.md`

## Notes
