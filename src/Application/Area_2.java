package Application;

import Entities.Triangle;

import java.util.Scanner;

public class Area_2 {

    //Triangulo com OOP

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Dimensoes do triangulo X: ");
        x.a = entrada.nextDouble();
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();

        System.out.println("Dimensoes do triangulo Y: ");
        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

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
