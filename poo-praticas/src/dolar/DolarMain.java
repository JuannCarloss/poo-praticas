package dolar;

import java.util.Scanner;

public class DolarMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor atual do dolar: ");
        Conversor.valorDolar = scan.nextDouble();

        System.out.println("Quantidade de dolares a ser comprada: ");
        Conversor.qtdDolar = scan.nextDouble();

        System.out.println(Conversor.realConversao());
    }
}
