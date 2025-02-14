package test;

import domain.Cadastro;
import domain.Listagem;
import domain.Produto;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CadastroTest {
    @Test
    public void testCadastroEListagem() {
        Cadastro cadastro = new Cadastro();
        Listagem listagem = new Listagem();

        cadastro.cadastrarProduto(new Produto("Produto A", true, 100.0, "Descrição A"));
        cadastro.cadastrarProduto(new Produto("Produto B", true, 50.0, "Descrição B"));


        assertEquals(2, cadastro.getProdutos().size());

        listagem.imprimirProdutosOrdenados(cadastro.getProdutos());
        assertEquals(50.0, cadastro.getProdutos().get(0).getValorDoProduto());
    }
    @Test
    public void testCadastroComValoresInvalidos() {
        Cadastro cadastro = new Cadastro();

        cadastro.cadastrarProduto(new Produto("Produto Inválido", true, -100.0, "Descrição Inválida"));
        assertEquals(0, cadastro.getProdutos().size());

        cadastro.cadastrarProduto(new Produto("Produto Zero", true, 0.0, "Descrição Zero"));
        assertEquals(0, cadastro.getProdutos().size());
    }
    @Test
    public void testOrdenacaoComMultiplosProdutos() {
        Cadastro cadastro = new Cadastro();
        Listagem listagem = new Listagem();

        cadastro.cadastrarProduto(new Produto("Produto C", true, 300.0, "Descrição C"));
        cadastro.cadastrarProduto(new Produto("Produto A", true, 100.0, "Descrição A"));
        cadastro.cadastrarProduto(new Produto("Produto B", true, 200.0, "Descrição B"));

        listagem.imprimirProdutosOrdenados(cadastro.getProdutos());
        assertEquals(100.0, cadastro.getProdutos().get(0).getValorDoProduto());
        assertEquals(200.0, cadastro.getProdutos().get(1).getValorDoProduto());
        assertEquals(300.0, cadastro.getProdutos().get(2).getValorDoProduto());
    }
    @Test
    public void testProdutosIndisponiveisParaVenda() {
        Cadastro cadastro = new Cadastro();
        Listagem listagem = new Listagem();

        cadastro.cadastrarProduto(new Produto("Produto Disponível", true, 100.0, "Descrição Disponível"));
        cadastro.cadastrarProduto(new Produto("Produto Indisponível", false, 200.0, "Descrição Indisponível"));

        assertEquals(2, cadastro.getProdutos().size());

        listagem.imprimirProdutosOrdenados(cadastro.getProdutos());
    }
    @Test
    public void testCadastroComNomesDuplicados() {
        Cadastro cadastro = new Cadastro();

        cadastro.cadastrarProduto(new Produto("Produto Duplicado", true, 100.0, "Descrição 1"));
        cadastro.cadastrarProduto(new Produto("Produto Duplicado", true, 200.0, "Descrição 2"));

        assertEquals(2, cadastro.getProdutos().size());
    }
    @Test
    public void testRemocaoDeProdutos() {
        Cadastro cadastro = new Cadastro();

        Produto produto = new Produto("Produto para Remover", true, 100.0, "Descrição para Remover");
        cadastro.cadastrarProduto(produto);

        cadastro.getProdutos().remove(produto);

        assertEquals(0, cadastro.getProdutos().size());
    }
    @Test
    public void testAtualizacaoDeProdutos() {
        Cadastro cadastro = new Cadastro();

        Produto produto = new Produto("Produto para Atualizar", true, 100.0, "Descrição para Atualizar");
        cadastro.cadastrarProduto(produto);

        produto.setValorDoProduto(150.0);

        assertEquals(150.0, cadastro.getProdutos().get(0).getValorDoProduto());
    }
    @Test
    public void testListagemVazia() {
        Cadastro cadastro = new Cadastro();
        Listagem listagem = new Listagem();

        listagem.imprimirProdutosOrdenados(cadastro.getProdutos());

        assertEquals(0, cadastro.getProdutos().size());
    }
}