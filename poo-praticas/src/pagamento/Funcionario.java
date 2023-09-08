package pagamento;

public class Funcionario {
    String nome;
    Double salarioBruto;
    Double taxa;

    public double salarioDescontado(){
        return salarioBruto - taxa;
    }

    public void aumentoSalarial (double percentual){
        this.salarioBruto += this.salarioBruto * (percentual / 100);
    }
}
