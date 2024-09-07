public class Main {
    public static void main(String[] args) {

        Cliente joao = new Cliente("João", 123);
        Cliente maria = new Cliente("Maria", 456);

        Conta contaCorrenteJoao = new ContaCorrente(joao);
        Conta contaDolarJoao = new ContaEmDolar(joao);

        ContaCorrente contaCorrenteMaria = new ContaCorrente(maria);
        ContaPoupanca contaPoupancaMaria = new ContaPoupanca(maria);

//        contaCorrenteJoao.imprimirExtrato();
//        contaDolarJoao.imprimirExtrato();

//        contaCorrenteMaria.imprimirExtrato();
//        contaPoupancaMaria.imprimirExtrato();

//        contaCorrenteMaria.depositar(250);
//        contaCorrenteJoao.depositar(1000);

//        contaCorrenteJoao.imprimirExtrato();
//        contaDolarJoao.imprimirExtrato();
//
//        contaCorrenteMaria.imprimirExtrato();
//        contaPoupancaMaria.imprimirExtrato();
//
//        contaCorrenteMaria.transferir(100, contaPoupancaMaria);
//        contaCorrenteJoao.transferir(300, contaDolarJoao);
//
//        contaCorrenteJoao.imprimirExtrato();
//        contaDolarJoao.imprimirExtrato();
//
//        contaCorrenteMaria.imprimirExtrato();
//        contaPoupancaMaria.imprimirExtrato();
//
//        contaDolarJoao.transferir(15, contaCorrenteMaria);
//
//        contaCorrenteJoao.imprimirExtrato();
//        contaDolarJoao.imprimirExtrato();
//
//        contaCorrenteMaria.imprimirExtrato();
//        contaPoupancaMaria.imprimirExtrato();

//        contaCorrenteMaria.sacar(1500);
//        contaCorrenteMaria.imprimirExtrato();
//        contaCorrenteMaria.transferir(600, contaCorrenteJoao);
//        contaCorrenteMaria.transferir(100, contaPoupancaMaria);
//
//        contaPoupancaMaria.imprimirExtrato();
//        contaPoupancaMaria.render();

        contaCorrenteMaria.emprestimo(10000);
        contaCorrenteMaria.imprimirExtrato();
        contaCorrenteMaria.pagarParcelaEmprestimo();
        contaCorrenteMaria.imprimirExtrato();
        contaCorrenteMaria.pagarParcelaEmprestimo();
        contaCorrenteMaria.imprimirExtrato();
    }
}