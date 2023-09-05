package store;

public class Product {
    public String nome;
    public double preco;
    public int qtd;

    public double valorTotal(){
        return qtd * preco;
    }

    public void addProdutos(int qtd){
        this.qtd += qtd;
    }

    public void removerProduto(int qtd){
        this.qtd -= qtd;
    }
}
