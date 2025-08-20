import java.util.ArrayList;

public class CatalogoBiblioteca {
    public static void main(String[] args) {
        // Criando uma lista de ItemBiblioteca (usando polimorfismo)
        ArrayList<ItemBiblioteca> catalogo = new ArrayList<>();

        // Adicionando um Livro e uma Revista à lista
        catalogo.add(new Livro("A Bússola de Ouro", 1995, "Philip Pullman"));
        catalogo.add(new Revista("National Geographic", 2023, 250));
        catalogo.add(new Livro("1984", 1949, "George Orwell"));
        catalogo.add(new Revista("Superinteressante", 2024, 450));

        // Percorrendo a lista e exibindo as informações de cada item
        for (ItemBiblioteca item : catalogo) {
            System.out.println("---");
            item.exibirInfo();
        }
        System.out.println("---");
    }
}