FROM openjdk:17
EXPOSE 8080
ADD target/movie-app-backend.jar movie-app-backend.jar
ENTRYPOINT ["java", "-jar", "/movie-app-backend.jar"]