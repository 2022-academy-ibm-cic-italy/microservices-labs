FROM openjdk:8-jre-alpine

ENV APP_HOME /nome

RUN mkdir $APP_HOME
ADD ./target/*.jar $APP_HOME/app.jar

RUN apk --no-cache add curl

WORKDIR $APP_HOME

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]