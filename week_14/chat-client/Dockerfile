FROM openjdk:21

RUN mkdir /app

COPY target/chat-client-0.1.jar /app/client.jar

WORKDIR /app

CMD ["java", "-jar", "client.jar"]
