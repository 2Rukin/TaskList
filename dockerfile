FROM openjdk:17-jdk-slim
COPY target/TaskList-0.0.1-SNAPSHOT.jar application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "application.jar"]

