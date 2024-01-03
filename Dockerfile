FROM openjdk:17
EXPOSE 8080
ADD target/movie-app-backend.jar movie-app-backend.jar

ENV SPRING_DATASOURCE_URL=jdbc:postgresql://ec2-3-232-218-211.compute-1.amazonaws.com:5432/dbd24j4f8nb8se
ENV SPRING_DATASOURCE_USERNAME=bnoypmodifxbqh
ENV SPRING_DATASOURCE_PASSWORD=8d5047e372eb48b67a3d70248a3498dcd89df508baef23f96b93c22422b52389
ENV SPRING_DATASOURCE_DRIVER-CLASS-NAME=org.postgresql.Driver
ENV SPRING_JPA_HIBERNATE_DDL-AUTO=update

ENTRYPOINT ["java", "-jar", "/movie-app-backend.jar"]