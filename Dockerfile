FROM openjdk:11
VOLUME /temp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} gerador-cpf.jar
ENTRYPOINT ["java","-jar","/gerador-cpf.jar"]