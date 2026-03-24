package Application;

import Entities.AcessoBanco;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        AcessoBanco acessoBanco = new AcessoBanco();

        System.out.println("Digite seu nome: ");
        AcessoBanco.Name = entrada.nextLine();

        System.out.println("Digite seu numero da conta: ");
        AcessoBanco.numeroConta = entrada.nextInt();

        System.out.println("Digite o valor do depósito: ");
        double saldo = entrada.nextDouble();
        acessoBanco.deposito(saldo);
        System.out.println("Saldo atual: " + acessoBanco.saldo);

        System.out.println();

        System.out.println("Realizar depósito: ");
        double dep = entrada.nextDouble();
        acessoBanco.deposito(dep);
        System.out.println("Saldo atual: " + acessoBanco.saldo);

        System.out.println();

        while (dep != 0) {
            System.out.println("Realizar depósito: ");
            dep = entrada.nextDouble();
            System.out.println("Saldo atual: " + acessoBanco.deposito(dep));
            System.out.println();
        }

        System.out.println("Realizar saque: ");
        double saque = entrada.nextDouble();
        acessoBanco.saque(saque);
        System.out.println("Saldo atual: " + acessoBanco.saldo);

        while (saque != 0) {
            System.out.println("Realizar saque: ");
            saque = entrada.nextDouble();
            System.out.println("Saldo atual: " + acessoBanco.saque(saque));
            System.out.println();
        }


        entrada.close();

    }
}