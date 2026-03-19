package Application;

import Entities.Conversor;

import java.util.Scanner;

public class ConversorDolar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dollar price: ");
        double dolar = entrada.nextDouble();

        System.out.println("How many dollar will be bought?: ");
        double dolar2 = entrada.nextDouble();

        double D = Conversor.dollarPrice(dolar, dolar2);
        double valorTotal = Conversor.includeIof(D);

        System.out.println(Conversor.msgIof());

        System.out.printf("Amount to be paid in reais: R$ %.2f%n", valorTotal);

        entrada.close();
    }
}
