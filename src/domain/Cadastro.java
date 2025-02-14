package domain;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private final List<Produto> produtos;

    public Cadastro() {
        this.produtos = new ArrayList<>();
    }
    public void cadastrarProduto(Produto produto){
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
