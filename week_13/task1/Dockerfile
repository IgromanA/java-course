FROM openjdk:21

RUN mkdir /app

COPY target/task1-0.1.jar /app/task.jar

WORKDIR /app

CMD ["java", "-jar", "task.jar"]
