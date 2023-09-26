package construtores;

import java.util.Scanner;

public class StoreMain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Passe os dados do produto: ");
        System.out.println("---------------------------");
        System.out.println("nome do produto: ");
        String nome = scan.next();

        System.out.println("valor do produto: ");
        double preco = scan.nextDouble();

        System.out.println("Quantidade em estoque: ");
        int qtd = scan.nextInt();

        Product2 produto = new Product2(nome, preco, qtd);

        System.out.println("Produto: " + produto.getNome() + ", $" + produto.getPreco() + ", unidades: "+ produto.getQtd() +", total: " + "$" + produto.valorTotal());

        System.out.println("quantidade para ser adicionada: ");
        produto.addProdutos(scan.nextInt());
        System.out.println("Produto Atualizado: " + produto.getNome() + ", $" + produto.getPreco() + ", unidades: " + produto.getQtd() + ", total: " + "$" + produto.valorTotal());

        System.out.println("Digite a quantidade que vai ser removida: ");
        produto.removerProduto(scan.nextInt());
        System.out.println("Produto Atualizado: " + produto.getNome() + ", $" + produto.getPreco() + ", unidades: " + produto.getQtd() + ", total: " + "$" + produto.valorTotal());
    }
}
