class ProdutoDigital implements Vendavel {
    private double preco;
    private int tamanhoArquivoMB;

    public ProdutoDigital(double preco, int tamanhoArquivoMB) {
        this.preco = preco;
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    @Override
    public double calcularPrecoFinal() {
        // Exemplo de lógica de desconto para arquivos grandes
        if (tamanhoArquivoMB > 500) {
            return preco * 0.9; // 10% de desconto para arquivos maiores que 500MB
        }
        return preco;
    }
}