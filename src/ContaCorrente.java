public class ContaCorrente extends Conta {

    private static final double JURO_ROTATIVO = 0.03;

    protected double divida = 0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void emprestimo (double valor) {
        divida += valor + valor * JURO_ROTATIVO;
        System.out.println(String.format("Empréstimo realizado. Parcelas de 12x R$ %.2f", valor / 12));
    }

    public void pagarParcelaEmprestimo () {
        divida -= divida / 12;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente de " + cliente + " ===");
        System.out.println(String.format("Empréstimo a pagar: R$ %.2f ", divida));
        super.imprimirInfosComuns();
    }
}
