FROM amazoncorretto:11-alpine-jdk
MAINTAINER rateyourmusic.com
COPY build/libs/gateway-service-1.0.0-SNAPSHOT.jar gateway-service-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/gateway-service-1.0.0-SNAPSHOT.jar"]