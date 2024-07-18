FROM openjdk:17

COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 3001

CMD ["java", "-jar", "app.jar"]