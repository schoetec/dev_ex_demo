FROM bellsoft/liberica-runtime-container:jdk-21.0.12.1-slim-musl

WORKDIR /app

COPY ./target/WebService-0.1.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]