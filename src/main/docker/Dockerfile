FROM maven:3.8.5-openjdk-17
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT {"java", "-jar", "application.jar"}