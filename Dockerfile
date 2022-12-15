FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD ./HW_7_3_1_1-0.0.1-SNAPSHOT.jar /target/

CMD ["java", "-jar", "app.jar"]