class ProdutoFisico implements Vendavel {
    private double preco;
    private double frete;

    public ProdutoFisico(double preco, double frete) {
        this.preco = preco;
        this.frete = frete;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + frete;
    }
}