FROM openjdk:11-slim as build
LABEL maintainer="Mahdi Sharifi <mahdi.elu@gmail.com>"
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]