FROM openjdk:15
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} address-service.jar
ENTRYPOINT ["java","-jar","/address-service.jar"]
EXPOSE 8091