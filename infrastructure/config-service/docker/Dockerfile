FROM openjdk:12-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} config-service-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/config-service-1.0.0-SNAPSHOT.jar"]
