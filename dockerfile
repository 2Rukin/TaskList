FROM maven:3-openjdk-17

WORKDIR /app
COPY src src

RUN mvn package

COPY target/tasklist-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar","app.jar"]

