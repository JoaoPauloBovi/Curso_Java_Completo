package Application;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        //Exemplo de Código sem OOP

        Scanner entrada = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        System.out.println("Dimensoes do triangulo X: ");
        xA = entrada.nextDouble();
        xB = entrada.nextDouble();
        xC = entrada.nextDouble();
        System.out.println("Dimensoes do triangulo Y: ");
        yA = entrada.nextDouble();
        yB = entrada.nextDouble();
        yC = entrada.nextDouble();

        double P = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(P * (P - xA) * (P - xB) * (P - xC));

        P = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(P * (P - xA) * (P - xB) * (P - xC));

        System.out.printf("Area do triangulo X: %.2f%n ", areaX);
        System.out.printf("Area do triangulo Y: %.2f%n ", areaY);

        if (areaX > areaY) {
            System.out.println("Maior Área X");
        } else {
            System.out.println("Maior Área Y");
        }

        entrada.close();
    }
}