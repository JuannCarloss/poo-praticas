package boletim;

public class Aluno {
    String nome;
    Double n1, n2, n3;

    public Double somaNotas() {
        return n1 + n2 + n3;
    }

    public String confereAprovacao() {
        double media = somaNotas() / 3;
        if (media >= 7){
            return "APROVADO";
        }else {
            return "REPROVADO!!! Quantidade necessária para aprovação: " + (10 - media);
        }
    }
}
