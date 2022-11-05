package validation;

import java.util.List;

public class Validador {

    public List<Integer> validarDigitos(List<Integer> digitos) {
        int peso = 10;
        int somaDigitosComPeso;
        for (int i = 0; i < 2; i++) {
            somaDigitosComPeso = 0;
            if (i == 1) {
                peso = 11;

            }

            for (int Digito : digitos) {
                somaDigitosComPeso += (Digito * peso);
                peso--;
            }
            int restoDaDivisao = (somaDigitosComPeso % 11);
            int digitoGerado;

            if (restoDaDivisao < 2) {
                digitoGerado = 0;
            } else {
                digitoGerado = 11 - restoDaDivisao;
            }
            digitos.add(digitoGerado);

        }
        return digitos;
    }
}
