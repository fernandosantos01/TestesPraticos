package domain;

public class Produto {
    private String nomeDoProduto;
    private boolean disponivelParaVenda;
    private double valorDoProduto;
    private String descricaoProduto;

    public Produto(String nomeDoProduto, boolean disponivelParaVenda, double valorDoProduto, String descricaoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.disponivelParaVenda = disponivelParaVenda;
        this.valorDoProduto = valorDoProduto;
        this.descricaoProduto = descricaoProduto;
    }

    @Override
    public String toString() {
        return "===========Produto==============" +
                "\nNome: " + nomeDoProduto + '\'' +
                "\nDisponivel Para Venda = " + disponivelParaVenda +
                "\nValor do Produto = " + valorDoProduto +
                "\nDescrição Produto = " + descricaoProduto + '\'' +
                ' ';
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public boolean isDisponivelParaVenda() {
        return disponivelParaVenda;
    }

    public void setDisponivelParaVenda(boolean disponivelParaVenda) {
        this.disponivelParaVenda = disponivelParaVenda;
    }

    public double getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(double valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
}
