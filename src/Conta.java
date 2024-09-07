import java.util.Objects;
import java.util.Scanner;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (autenticar() && valor <= saldo) {
            saldo -= valor;
            System.out.println();
        } else {
            System.out.println("Não há saldo!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println();
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (autenticar() && valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
        } else  {
            System.out.println("Não há saldo!");
        }
    }

    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular %s", this.cliente.getNome()));
        System.out.println(String.format("Agência %d", this.agencia));
        System.out.println(String.format("Conta %d", this.numero));
        System.out.println(String.format("Saldo R$ %.2f", this.saldo));
    }

    // Metodo para simular uma autenticação por senha numérica
    public boolean autenticar() {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 3;

        while (tentativas > 0) {
            System.out.print("Digite a senha da conta de " + cliente.getNome() + " ");
            int senhaDigitada = Integer.parseInt(scanner.nextLine());

            if (Objects.equals(cliente.getSenha(), senhaDigitada)) {
                System.out.println("Autenticação bem-sucedida!");
                return true;
            } else {
                tentativas--;
                System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
            }

            if (tentativas == 0) {
                System.out.println("Número máximo de tentativas alcançado. Operação bloqueada.");
                return false;
            }
        }
        return false;
    }

}
