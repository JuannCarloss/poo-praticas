package bank;

import java.util.Objects;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User juan = new User(1111, "Juan", 0.0);
        System.out.println(juan.toString());

        System.out.println("Deseja fazer algum depósito em conta ?");
        String question = scan.next();

        while (Objects.equals(question, "sim")){
            System.out.println("Digite o valor a ser depositado em conta: ");
            juan.depositValue(scan.nextDouble());

            System.out.println("Dados atualizados da " + juan.toString());
            System.out.println("Deseja fazer mais algum depósito ?");
            question = scan.next();
        }

        System.out.println("Deseja fazer algum saque ?");
        question = scan.next();

        while (Objects.equals(question, "sim")){
            System.out.println("Digite o valor a ser sacado da conta: ");
            juan.withdrawValue(scan.nextDouble());

            System.out.println("Dados atualizados da " + juan.toString());

            System.out.println("Deseja fazer mais algum saque ?");
            question = scan.next();
        }

        System.out.println("Atualização final da "+juan.toString());
    }


}
