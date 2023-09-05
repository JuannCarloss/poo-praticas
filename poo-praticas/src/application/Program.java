package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double xA, xB, xC, yA, yB, yC;

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite os valores do triangulo X>: ");
        xA = scan.nextDouble();
        xB = scan.nextDouble();
        xC = scan.nextDouble();

        System.out.println("Digite os valores do triangulo Y: ");
        yA = scan.nextDouble();
        yB = scan.nextDouble();
        yC = scan.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.println("Area do triangulo X: " + areaX);
        System.out.println("-----------------------------");
        System.out.println("Area do triangulo Y: " + areaY);

        if (areaX > areaY) {
            System.out.println("a maior area é do triangulo X");
        } else {
            System.out.println("a maior area é do triangulo Y");
        }
    }
}
