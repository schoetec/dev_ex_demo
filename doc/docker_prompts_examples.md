For the WebPortal can you create a Docker file that will build the artifact using the jar file as found in ./target folder, please use the bellsoft/liberica-runtime-container:jdk-21.0.12.1-slim-musl. Ensure that the service is started at port 8090 when docker starts the container. Just create the Docker file in the WebPortal folder do not run the command.

Result :
FROM bellsoft/liberica-runtime-container:jdk-21.0.12.1-slim-musl

WORKDIR /app

COPY ./target/WebPortal-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "app.jar"]

Answer:
I have created the Dockerfile for the WebPortal application. The Dockerfile uses the bellsoft/liberica-runtime-container:jdk-21.0.12.1-slim-musl image and copies the JAR file from the ./target folder. The service is configured to start on port 8090 when the Docker container starts.



For the docker-compose :
Inside the SpringWeb folder create a docker-compose file for the services defined in SpringWeb/WebPortal on port 8090 and SpringWeb/WebService on port 8080

Result :

version: '3.8'

services:
  webportal:
    build: ./WebPortal
    ports:
      - "8090:8090"
    depends_on:
      - webservice

  webservice:
    build: ./WebService
    ports:
      - "8080:8080"

networks:
  default:
    driver: bridge