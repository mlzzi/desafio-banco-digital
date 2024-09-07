//Conta para simular conta em dolar, com métodos para simular conversão para dólar e vice-versa

public class ContaEmDolar extends Conta {

    private static final double COTACAO = 5.60; // Cotação do dólar em real

    public ContaEmDolar(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor / COTACAO);
        System.out.println(String.format("%s recebeu valor em conta!", cliente.getNome()));
        System.out.println(" ");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (contaDestino instanceof ContaEmDolar) {
            super.transferir(valor, contaDestino);
            System.out.println(String.format("%s transferiu R$ %.2f para %s", cliente.getNome(), valor / COTACAO, contaDestino));
            System.out.println(" ");
        } else if (contaDestino instanceof ContaCorrente || contaDestino instanceof ContaPoupanca) {
            double valorConvertido = valor * COTACAO;
            if (super.autenticar()) {
                contaDestino.depositar(valorConvertido);
                this.saldo -= valor;
                System.out.println(String.format("%s transferiu R$ %.2f para %s", cliente.getNome(), valor * COTACAO, contaDestino));
                System.out.println(" ");
            }
        } else {
            System.out.println("Não há saldo!");
            System.out.println(" ");
        }
    }


    @Override
    public void sacar(double valor) {
        super.sacar(valor * COTACAO);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta em Dólar de " + cliente + " ===");
        System.out.println(String.format("Agência %d", this.agencia));
        System.out.println(String.format("Conta %d", this.numero));
        System.out.println(String.format("Saldo US$ %.2f", this.saldo));
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Conta em Dólar de " + cliente;
    }
}
