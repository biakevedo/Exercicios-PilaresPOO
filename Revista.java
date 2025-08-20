class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Edição: " + edicao);
    }
}
