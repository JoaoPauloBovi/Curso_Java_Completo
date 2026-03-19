package Application;

import Entities.Calculo;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double raio = entrada.nextDouble();

        double c = Calculo.circunferencia(raio);
        double v = Calculo.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculo.PI);

        entrada.close();
    }
}
