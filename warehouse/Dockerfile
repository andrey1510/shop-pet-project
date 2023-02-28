FROM maven:3-amazoncorretto-17 AS build
COPY pom.xml /app/
COPY src /app/src
RUN mvn -f /app/pom.xml clean package

FROM amazoncorretto:17.0.5-alpine3.15
COPY --from=build /app/target/app*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#
#FROM amazoncorretto:17.0.5-alpine3.15
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]