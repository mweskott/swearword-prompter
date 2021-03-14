FROM openjdk:11

WORKDIR /app
COPY target/application.jar .

CMD java -jar application.jar
