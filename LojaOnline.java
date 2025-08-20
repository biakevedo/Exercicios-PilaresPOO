import java.util.ArrayList;
import java.util.List;

public class LojaOnline {
    public static void main(String[] args) {
        // Criando uma lista de itens vendáveis (usando a interface)
        List<Vendavel> carrinho = new ArrayList<>();

        // Adicionando produtos ao carrinho
        carrinho.add(new ProdutoFisico(120.0, 15.0)); // Camiseta: R$ 120 + R$ 15 de frete
        carrinho.add(new ProdutoDigital(50.0, 800));  // Ebook de 800MB (recebe desconto)
        carrinho.add(new ProdutoFisico(350.0, 20.0)); // Tênis: R$ 350 + R$ 20 de frete
        carrinho.add(new ProdutoDigital(25.0, 150));  // Música de 150MB (sem desconto)

        double valorTotalCarrinho = 0.0;

        System.out.println("Itens no carrinho:");
        for (Vendavel item : carrinho) {
            double precoFinal = item.calcularPrecoFinal();
            System.out.printf("  - Preço final do item: R$ %.2f\n", precoFinal);
            valorTotalCarrinho += precoFinal;
        }

        System.out.println("---");
        System.out.printf("Valor total do carrinho: R$ %.2f\n", valorTotalCarrinho);
    }
}