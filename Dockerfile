FROM openjdk:17
EXPOSE 8080
ADD target/KUMDB-0.0.1-SNAPSHOT.jar KUMDB-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/KUMDB-0.0.1-SNAPSHOT.jar"]
