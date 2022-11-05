import facade.CpfFacade;

public class GeradorCPFTest {
    public static void main(String[] args) {
        CpfFacade cpfFacade = new CpfFacade();
        cpfFacade.capturarDadosEntrada();
        cpfFacade.gerarCpf();
        cpfFacade.imprimirCpf();
    }
}
