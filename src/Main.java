import domain.Cadastro;
import domain.Listagem;
import domain.Produto;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Listagem listagem = new Listagem();


        cadastro.cadastrarProduto(new Produto("Notebook", true, 3500.0, "Notebook 8GB RAM"));
        cadastro.cadastrarProduto(new Produto("Smartphone", true, 2000.0, "Smartphone 128GB"));
        cadastro.cadastrarProduto(new Produto("Tablet", false, 1500.0, "Tablet 10 polegadas"));


        listagem.imprimirProdutosOrdenados(cadastro.getProdutos());
    }
}