public class ContaBancaria implements OperacoesConta {
    private int numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(double saldo, int numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // Adiciona o valor ao saldo
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor; // Subtrai o valor do saldo
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo; // Retorna o saldo atual
    }

    // Método para exibir o saldo
    public void exibirStatus() {
        System.out.println("O saldo da conta " + numeroConta + " é: R$ " + saldo);
    }

    // Getter para o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Método toString para exibir os detalhes da conta
    @Override
    public String toString() {
        return "Conta número " + numeroConta + " com saldo de R$ " + saldo;
    }
}

