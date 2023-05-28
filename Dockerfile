FROM alpine:3.14

RUN  apk update && apk upgrade # Atualização do sistema operacional linux alpine
RUN  apk add openjdk11         # Instalação do Java 11
RUN apk add maven              # Instalação do maven
RUN echo copiando a pasta src do projeto, para a pasta /home/app/src do alpine
COPY src /home/app/src
RUN echo copiando o arquivo pom.xml do projeto, para a pasta /home/app do alpine
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package   # executando o comando para gerar .jar dentro do alpine
RUN echo executando o .jar gerado na pasta /home/app/target do alpine
ENTRYPOINT ["java","-jar","/home/app/target/gerador-cpf-1.0-SNAPSHOT.jar"]
