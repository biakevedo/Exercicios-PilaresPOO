public class Produto implements Exibivel {
    String nome;
    double preco;
    String categoria;

    // Construtor que recebe nome, preco e categoria
    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
        if (preco > 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Categoria: " + categoria);
    }
}



