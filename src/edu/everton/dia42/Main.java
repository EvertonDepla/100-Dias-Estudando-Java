package edu.everton.dia42;

    import edu.everton.dia42.models.Endereco;
    import edu.everton.dia42.models.Gerente;
    import edu.everton.dia42.models.OperadorDeCaixa;
    import edu.everton.dia42.models.Vendedor;

public class Main {

    public static void main(String[] args) {
        /*Endereco endereco = new Endereco();
        endereco.setRua("Endereço para essa rua");
        System.out.println(endereco.getRua());*/

        Endereco endereco =
            new Endereco("Rua funcionário",
                "Complemento endereço funcionário", "bairro funcionário");
        System.out.println(endereco);
        System.out.println("-----");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Camila Vendedora");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("-----");

        OperadorDeCaixa operadorCaixa =
            new OperadorDeCaixa("Paulo Op Caixa", "789.456.123-00", 2000d, endereco);
        System.out.println(operadorCaixa);
        System.out.println("-----");

        Gerente gerente = new Gerente();
        gerente.setNome("Everton Gerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3.0);

        System.out.println(gerente);

    }
}
