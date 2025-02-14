package domain;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Listagem {
    public void imprimirProdutosOrdenados(List<Produto>produtos){
        Collections.sort(produtos, Comparator.comparingDouble(Produto::getValorDoProduto));
        System.out.println("=======LISTAGEM DE PRODUTOS========");
        for (Produto produto : produtos){
            System.out.println(produto);
        }
    }
}
