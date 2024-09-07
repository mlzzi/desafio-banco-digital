//Conta para simular conta em dolar, com métodos para simular conversão para dólar e vice-versa

public class ContaEmDolar extends Conta {

    private static final double COTACAO = 5.60; // Cotação do dólar em real

    public ContaEmDolar(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor / COTACAO);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (contaDestino instanceof ContaEmDolar) {
            super.transferir(valor, contaDestino);
        } else if (contaDestino instanceof ContaCorrente || contaDestino instanceof ContaPoupanca) {
            double valorConvertido = valor * COTACAO;
            if (super.autenticar()) {
                contaDestino.depositar(valorConvertido);
                this.saldo -= valor;
            }
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
    }
}
