FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD build/libs/helloworld-0.1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
