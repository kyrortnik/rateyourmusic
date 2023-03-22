FROM amazoncorretto:11-alpine-jdk
MAINTAINER rateyourmusic.com
COPY build/libs/discovery-service-1.0.0-SNAPSHOT.jar discovery-service-1.0.0-SNAPSHOT.jar
EXPOSE 8671
ENTRYPOINT ["java","-jar","/discovery-service-1.0.0-SNAPSHOT.jar"]