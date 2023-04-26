FROM gradle:8.0.2-jdk11 AS builder
WORKDIR /home/infrastructure/gateway-service
COPY ../../build.gradle /home/
COPY ../../settings.gradle /home/
COPY ../../infrastructure/gateway-service /home/infrastructure/gateway-service
RUN gradle bootJar --no-daemon

FROM openjdk:11-jre-slim
COPY --from=builder /home/infrastructure/gateway-service/build/libs/*.jar /usr/local/lib/gateway-service.jar
EXPOSE 8765
ENTRYPOINT ["java", "-jar", "/usr/local/lib/gateway-service.jar"]
