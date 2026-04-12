package Application;

import Entities.AcessoBanco;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        AcessoBanco acessoBanco;

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu numero da conta: ");
        int conta = entrada.nextInt();

        System.out.println("Depósito Inial (s/n)?");
        char deposito = entrada.next().charAt(0);

        if (deposito == 's') {
            System.out.print("Valor do deposito inicial ");
            double depositoInicial = entrada.nextDouble();
            acessoBanco = new AcessoBanco(nome, conta, depositoInicial);
        } else {
            acessoBanco = new AcessoBanco(nome, conta);
        }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(acessoBanco);

        System.out.println();
        System.out.print("Valor do deposito: ");
        double valorDeposito = entrada.nextDouble();
        acessoBanco.deposito(valorDeposito);

        System.out.println("Atualizaçao dos dados da conta: ");
        System.out.println(acessoBanco);

        System.out.println();
        System.out.print("Valor do saque: ");
        double valorSaque = entrada.nextDouble();
        acessoBanco.saque(valorSaque);

        System.out.println("Atualizaçao dos dados da conta: ");
        System.out.println(acessoBanco);


        entrada.close();
    }
}