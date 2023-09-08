package boletim;

import java.util.Scanner;

public class BoletimMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Nome: ");
        aluno.nome = scan.next();

        System.out.println("Digite as 3 notas do aluno(de 0 a 10): ");
        aluno.n1 = scan.nextDouble();
        aluno.n2 = scan.nextDouble();
        aluno.n3 = scan.nextDouble();

        System.out.println(aluno.nome);
        System.out.println(aluno.somaNotas());
        System.out.println(aluno.confereAprovacao());
    }
}
