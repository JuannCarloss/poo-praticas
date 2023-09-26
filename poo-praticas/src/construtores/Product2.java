package construtores;

import store.Product;

public class Product2 {
    private String nome;
    private double preco;
    private int qtd;


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

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}