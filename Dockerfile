FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/springboot-github-actions.jar target/springboot-github-actions.jar
ENTRYPOINT ["java","-jar","/springboot-github-actions.jar"]
