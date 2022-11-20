# syntax=docker/dockerfile:1
# Which "official Java image"
FROM openjdk:8
# Working directory
WORKDIR /app
# Copy from your host(PC, laptop) to container
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
# Run this inside the image
RUN ./mvnw dependency:go-offline
COPY src ./src
# Run inside container
CMD ["./mvnw", "spring-boot:run"]