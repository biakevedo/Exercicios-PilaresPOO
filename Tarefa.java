public class Tarefa implements Concluivel {
    String descricao;
    boolean concluida = false; // Inicializa como falso

    @Override
    public void concluir() {
        this.concluida = true; // Marca a tarefa como concluída
    }

    @Override
    public boolean estaConcluida() {
        return concluida; // Retorna o estado da tarefa
    }

    public boolean isConcluida() {
        return concluida; // Método adicional para verificar o estado
    }
}
