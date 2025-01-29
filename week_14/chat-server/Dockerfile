FROM openjdk:21

RUN mkdir /app

COPY target/chat-server-0.1.jar /app/server.jar

WORKDIR /app

CMD ["java", "-jar", "server.jar"]
