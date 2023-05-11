FROM gradle:8.0.2-jdk11 AS builder
WORKDIR /home/infrastructure/config-service
COPY ../../build.gradle /home/
COPY ../../settings.gradle /home/
COPY ../../infrastructure/config-service /home/infrastructure/config-service
RUN gradle bootJar --no-daemon

FROM openjdk:11-jre-slim
COPY --from=builder /home/infrastructure/config-service/build/libs/*.jar /usr/local/lib/config-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/config-service.jar"]
