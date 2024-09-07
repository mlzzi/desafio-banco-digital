public class Main {
    public static void main(String[] args) {

        Cliente joao = new Cliente("João", 123);
        Cliente maria = new Cliente("Maria", 456);

        Conta contaCorrenteJoao = new ContaCorrente(joao);
        Conta contaDolarJoao = new ContaEmDolar(joao);

        ContaCorrente contaCorrenteMaria = new ContaCorrente(maria);
        ContaPoupanca contaPoupancaMaria = new ContaPoupanca(maria);

        contaCorrenteMaria.depositar(250);
        contaCorrenteJoao.depositar(1000);

        contaCorrenteJoao.sacar(250);

        contaCorrenteMaria.transferir(100, contaPoupancaMaria);
        contaCorrenteJoao.transferir(300, contaDolarJoao);

        contaDolarJoao.transferir(15, contaCorrenteMaria);

        contaCorrenteMaria.sacar(1500);
        contaCorrenteMaria.imprimirExtrato();
        contaCorrenteMaria.transferir(600, contaCorrenteJoao);
        contaCorrenteMaria.transferir(100, contaPoupancaMaria);

        contaPoupancaMaria.imprimirExtrato();
        contaPoupancaMaria.render();

        contaCorrenteMaria.emprestimo(10000);
        contaCorrenteMaria.pagarParcelaEmprestimo();
        contaCorrenteMaria.pagarParcelaEmprestimo();

        contaCorrenteMaria.imprimirExtrato();
        contaPoupancaMaria.imprimirExtrato();
        contaCorrenteJoao.imprimirExtrato();
        contaDolarJoao.imprimirExtrato();
    }
}