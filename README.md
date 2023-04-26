This is an web application which allows users to have their own rating of artists, albums, songs.
Tech-wise it has:
1. api side:
   - Java 11
   - Spring Boot
   - String Data JPA
   - Spring Security
   - Spring MVC
   - Keycloak
   - PostgresQL
   - Spring Cloud Config Server
   - Spring Cloud Discovery Service
   - Spring Cloud Gateway Service
   - Docker compose 
   - Gradle 
2. client side - TBD (probably react)
Main idea: 
 By running docker-compose the whole application starts in docker containers.
 TBD - Kubernetes, deploying in Cloud.

Plan for now:
1. Docker-compose up starts up:
- postgres
- keycloak
- config-service
- discovery-service
- gateway-service
--- Works when infrastructure is run in order and when previous service is up
2. Authentication service, customize keycloak ???
3. Create domain application:
- Artist
- Album
- Rating
- Song
4. Integration tests