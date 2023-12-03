FROM openjdk:17-jdk-alpine
ADD target/github-action-example.jar github-action-example.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "github-action-example.jar"]
