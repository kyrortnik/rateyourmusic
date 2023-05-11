FROM gradle:8.0.2-jdk11 AS builder
WORKDIR /home/applications/domain-service
COPY ../../build.gradle /home/
COPY ../../settings.gradle /home/
COPY ../../applications/domain-service /home/applications/domain-service
RUN gradle bootJar --no-daemon

FROM openjdk:11-jre-slim
COPY --from=builder /home/applications/domain-service/build/libs/*.jar /usr/local/lib/domain-service.jar
EXPOSE 8011
ENTRYPOINT ["java", "-jar", "/usr/local/lib/domain-service.jar"]
