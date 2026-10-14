FROM bellsoft/liberica-runtime-container:jdk-21.0.12.1-slim-musl

WORKDIR /app

COPY ./target/WebPortal-0.1.jar app.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "app.jar"]