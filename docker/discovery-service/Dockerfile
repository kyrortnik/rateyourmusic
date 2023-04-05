FROM gradle:8.0.2-jdk11 AS builder
WORKDIR /home/infrastructure/discovery-service
COPY ../../build.gradle /home/
COPY ../../settings.gradle /home/
COPY ../../infrastructure/discovery-service /home/infrastructure/discovery-service
RUN gradle bootJar --no-daemon

FROM openjdk:11-jre-slim
COPY --from=builder /home/infrastructure/discovery-service/build/libs/*.jar /usr/local/lib/discovery-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/discovery-service.jar"]
