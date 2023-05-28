## Objetivo: ##
Gerar quantos CPF's o usuário solicitar, desde que o usuário informe qual o sexto e sétimo dígitos ele deseja que o CPF
tenha.

### Requisitos: ###
- Maven;
- Java 8+;
- IDE de sua preferência (neste projeto foi utilizado o Intellij);
- Docker (opcional);

### Execução via IDE: ###
1) Faça o clone do projeto: **git clone https://github.com/CarlosFernandoXavier/gerador-cpf.git**
2) Execute o comando **mvn clean install**;
3) Execute a classe GeradorCPFTest;
4) Digite a quantidade de CPF's que quer gerar;
5) Digite o sexto dígito que você gostaria para o CPF;
6) Digite o sétimos dígito que você gostaria para o CPF;

### Execução via Docker: ###
1) Faça o clone do projeto: **git clone https://github.com/CarlosFernandoXavier/gerador-cpf.git**
2) Execute o comando **mvn clean package**;
3) Abra o terminal do Docker na raiz do projeto;
    - 2.1) Digite: **docker build -t gerador-cpf .**
    - 2.2) Digite: **docker run -it -p 8080:8080 gerador-cpf**
4) Digite a quantidade de CPF's que quer gerar;
5) Digite o sexto dígito que você gostaria para o CPF;
6) Digite o sétimos dígito que você gostaria para o CPF;


### Observações: ###
Este projeto foi baseado na implementação do Anderson Bertanha: https://github.com/AndersonBertanha/geradorCPF
