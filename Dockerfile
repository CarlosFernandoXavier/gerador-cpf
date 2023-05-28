FROM alpine:3.14
RUN  apk update
RUN apk upgrade && apk add libc6-compat && apk add openjdk11 && apk add maven
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
ENTRYPOINT ["java","-jar","/home/app/target/gerador-cpf-1.0-SNAPSHOT.jar"]
