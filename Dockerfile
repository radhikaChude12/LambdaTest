FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/lambdatest-jar.jar lambdatest-jar.jar
EXPOSE 8080
CMD ["java","-jar","lambdatest-jar.jar"]
