package Application;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        //Triangulo sem POO

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dimensoes do triangulo X: ");
        double xA = entrada.nextDouble();
        double xB = entrada.nextDouble();
        double xC = entrada.nextDouble();

        System.out.println("Dimensoes do triangulo Y: ");
        double yA = entrada.nextDouble();
        double yB = entrada.nextDouble();
        double yC = entrada.nextDouble();

        double P = (xA + xB + xC) / (double) 2.0F;

        double areaX = Math.sqrt(P * (P - xA) * (P - xB) * (P - xC));

        P = (yA + yB + yC) / (double) 2.0F;

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
