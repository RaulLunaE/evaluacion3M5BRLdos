# Inicia con la imagen base que contiene Java runtime
FROM openjdk:17-jdk-alpine

# Se agrega el jar del microservicio al contenedor
COPY target/evaluacion3M5B-0.0.1-SNAPSHOT.jar evaluacion3M5B-0.0.1-SNAPSHOT.jar

# Se ejecuta el microservicio
ENTRYPOINT ["java", "-jar", "/evaluacion3M5B-0.0.1-SNAPSHOT.jar"]
