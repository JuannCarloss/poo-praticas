package application;

public class Triangulo {
    public Double lado1;
    public Double lado2;
    public Double lado3;




    public Double area(){
        Double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }
}
