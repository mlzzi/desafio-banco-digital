public class ContaPoupanca extends Conta {

    private static final double JUROS = 0.0051; //Simulação de juros mensal

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    // Metodo para simular rendimento do mês
    public void render() {
        if (super.saldo > 0) {
            double rendimento = saldo * JUROS;
            super.saldo += rendimento;
            System.out.println(String.format("Seu saldo rendeu este mês R$ %.2f", rendimento));
            System.out.println(" ");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança de " + cliente + " ===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "Conta Poupanca de " + cliente;
    }
}
