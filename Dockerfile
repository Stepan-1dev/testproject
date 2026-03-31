FROM openjdk:27-ea-15-jdk-oraclelinux10
WORKDIR /app
COPY /out/artifacts/testproject_jar/testproject.jar /app/project.jar
ENTRYPOINT ["java", "-jar", "project.jar"]