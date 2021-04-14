FROM openjdk:15
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} hystrix-dashboard.jar
ENTRYPOINT ["java","-jar","/hystrix-dashboard.jar"]
EXPOSE 8889