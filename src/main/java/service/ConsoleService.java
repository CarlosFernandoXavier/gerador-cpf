package service;

import java.util.Scanner;

public class ConsoleService {

    private Integer quantidadeCpfs;
    private Integer sextoDigito;
    private Integer setimoDigito;

    public void capturarEntrada() {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos CPF's você quer gerar? ");
        quantidadeCpfs = input.nextInt();
        System.out.println("Digite o valor do 6º  dígito do CPF:");
        sextoDigito = input.nextInt();
        System.out.println("Digite o valor do 7º  dígito do CPF:");
        setimoDigito = input.nextInt();
        input.close();
    }

    public Integer getQuantidadeCpfs() {
        return quantidadeCpfs;
    }

    public Integer getSextoDigito() {
        return sextoDigito;
    }

    public Integer getSetimoDigito() {
        return setimoDigito;
    }
}
