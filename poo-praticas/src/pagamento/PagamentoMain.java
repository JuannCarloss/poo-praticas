package pagamento;

import java.util.Scanner;

public class PagamentoMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner scan = new Scanner(System.in);

        funcionario.nome = scan.next();
        funcionario.salarioBruto = scan.nextDouble();
        funcionario.taxa = scan.nextDouble();

        System.out.println("Funcionário: "+funcionario.nome+ " Salário com taxas inclusas: " +funcionario.salarioDescontado());

        System.out.println("Digite a porcentagem de aumento salarial: ");
        funcionario.aumentoSalarial(scan.nextDouble());

        funcionario.salarioBruto = funcionario.salarioDescontado();

        System.out.println("Funcionário: "+funcionario.nome+ " Salário com aumento: " +funcionario.salarioBruto);
    }
}
