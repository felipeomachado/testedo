FROM maven:3.8.1-openjdk-8-slim

WORKDIR /home/app

COPY . .

RUN mvn clean package -Dmaven.test.skip=true

RUN cp target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]