package dolar;

public class Conversor {
    public static double valorDolar;
    public static double qtdDolar;

    public static double IOF = 1.06;

    public static Double realConversao() {
        return (Conversor.valorDolar * Conversor.qtdDolar) * Conversor.IOF;
    }
}
