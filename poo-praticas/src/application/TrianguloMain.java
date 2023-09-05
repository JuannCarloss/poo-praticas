package application;

import java.util.Scanner;

public class TrianguloMain {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        Triangulo t1 = new Triangulo();
        System.out.println("triangulo x");
        t1.lado1 = scan.nextDouble();
        t1.lado2 = scan.nextDouble();
        t1.lado3 = scan.nextDouble();

        Triangulo t2 = new Triangulo();
        System.out.println("triangulo y");
        t2.lado1 = scan.nextDouble();
        t2.lado2 = scan.nextDouble();
        t2.lado3 = scan.nextDouble();


        System.out.println(t1.area());
        System.out.println(t2.area());

        if (t1.area() > t2.area()){
            System.out.println("Area do triangulo X é maior");
        }else {
            System.out.println("Area do triangulo Y é maior");
        }

        System.out.println(t1);

    }
}
