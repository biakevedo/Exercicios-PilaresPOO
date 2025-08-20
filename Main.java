public class Main {
    public static void main(String[] args) {
        // Criando um objeto Produto
        Produto produto = new Produto("Caderno", 32.50, "Papeleria");
        produto.exibirDetalhes(); // Exibe os detalhes do produto

        // Criando um objeto ContaBancaria
        ContaBancaria contaBancaria = new ContaBancaria(1000, 559);

        // Depositando na conta
        contaBancaria.depositar(30); // Depósito de R$ 30.00

        // Exibindo o status da conta
        contaBancaria.exibirStatus(); // Exibe o saldo atualizado da conta

        // Criando uma tarefa
        Tarefa tarefa = new Tarefa();
        tarefa.concluir(); // Concluindo a tarefa

        // Verificando se a tarefa foi concluída
        System.out.println("Tarefa concluída? " + tarefa.estaConcluida());
    }
}
