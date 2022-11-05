package service;

import java.util.Scanner;

public class ConsoleService {

    private Integer quantidadeCpfs;
    private Integer sextoDigito;
    private Integer setimoDigito;

    public void capturarEntrada() {
        Scanner input= new Scanner(System.in);
        System.out.println("Quantos CPF's você quer gerar? ");
        quantidadeCpfs = Integer.parseInt(input.nextLine());
        System.out.println("Digite o valor do 6º  dígito do CPF:");
        sextoDigito = Integer.parseInt(input.nextLine());
        System.out.println("Digite o valor do 7º  dígito do CPF:");
        setimoDigito = Integer.parseInt(input.nextLine());
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
