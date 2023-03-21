FROM amazoncorretto:11-alpine-jdk
MAINTAINER rateyourmusic.com
COPY build/libs/config-service-1.0.0-SNAPSHOT.jar config-service-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/config-service-1.0.0-SNAPSHOT.jar"]