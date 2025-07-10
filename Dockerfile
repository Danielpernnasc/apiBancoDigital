FROM openjdk:17-jdk-slim
COPY target/apiclient-1.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080
