package store;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product produto = new Product();


        System.out.println("Passe os dados do produto: ");
        System.out.println("---------------------------");
        System.out.println("nome do produto: ");
        produto.nome = scan.next();

        System.out.println("valor do produto: ");
        produto.preco = scan.nextDouble();

        System.out.println("Quantidade em estoque: ");
        produto.qtd = scan.nextInt();

        System.out.println("Produto: " + produto.nome + ", $" + produto.preco + ", unidades: "+ produto.qtd +", total: " + "$" + produto.valorTotal());

        System.out.println("quantidade para ser adicionada: ");
        produto.addProdutos(scan.nextInt());
        System.out.println("Produto Atualizado: " + produto.nome + ", $" + produto.preco + ", unidades: " + produto.qtd + ", total: " + "$" + produto.valorTotal());

        System.out.println("Digite a quantidade que vai ser removida: ");
        produto.removerProduto(scan.nextInt());
        System.out.println("Produto Atualizado: " + produto.nome + ", $" + produto.preco + ", unidades: " + produto.qtd + ", total: " + "$" + produto.valorTotal());
    }
}
