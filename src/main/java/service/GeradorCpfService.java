package service;

import validation.Validador;

import java.util.ArrayList;
import java.util.List;

public class GeradorCpfService {

    private static final Integer SEXTO_DIGITO = 5;
    private static final Integer SETIMO_DIGITO = 6;

    public List<String> gerarCpf(Integer quantidadeCpfs, Integer sextoDigito, Integer setimoDigito) {
        List<Integer> listaNumerosAleatorios = new ArrayList<>();
        List<String> listaCpf = new ArrayList<>();

        Integer contador = 0;
        while (contador < quantidadeCpfs) {
            for (int i = 0; i <= 8; i++) {
                listaNumerosAleatorios.add(geraNumeroAleatorio());
            }

            if (listaNumerosAleatorios.get(SEXTO_DIGITO).equals(sextoDigito) &&
                    listaNumerosAleatorios.get(SETIMO_DIGITO).equals(setimoDigito)) {
                Validador validador = new Validador();
                listaNumerosAleatorios = validador.validarDigitos(listaNumerosAleatorios);

                StringBuilder t = new StringBuilder();
                listaNumerosAleatorios.forEach(numeroAleatorios -> t.append(numeroAleatorios));
                listaCpf.add(t.toString());
                contador++;
            }
            listaNumerosAleatorios.clear();
        }
        return listaCpf;
    }


    private int geraNumeroAleatorio() {
        int numero = (int) (Math.random() * 10);
        return numero;
    }

}
