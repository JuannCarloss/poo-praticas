package construtores;

import store.Product;

public class Product2 {
    public String nome;
    public double preco;
    public int qtd;


    public Product2(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public double valorTotal() {
        return qtd * preco;
    }

    public void addProdutos(int qtd) {
        this.qtd += qtd;
    }

    public void removerProduto(int qtd) {
        this.qtd -= qtd;
    }
}