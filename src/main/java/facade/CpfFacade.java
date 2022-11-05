package facade;

import service.ConsoleService;
import service.GeradorCpfService;

import java.util.ArrayList;
import java.util.List;

public class CpfFacade {

    private ConsoleService consoleService;
    private GeradorCpfService geradorCpfService;
    private List<String> listaCpf;

    public CpfFacade() {
        consoleService = new ConsoleService();
        geradorCpfService = new GeradorCpfService();
        listaCpf = new ArrayList<>();
    }

    public void capturarDadosEntrada() {
        consoleService.capturarEntrada();
    }

    public void gerarCpf() {
        listaCpf = geradorCpfService.gerarCpf(consoleService.getQuantidadeCpfs(),
                consoleService.getSextoDigito(),
                consoleService.getSetimoDigito());
    }

    public void imprimirCpf() {
        System.out.println("CPF's gerados: ");
        listaCpf.forEach(System.out::println);
    }
}
