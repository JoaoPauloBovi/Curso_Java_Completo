package Application;

import Entities.Info;

import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Info info = new Info();

        System.out.println("Informações do funcionário");
        System.out.println("Digite o nome do funcionario: ");
        info.nome = entrada.nextLine();

        System.out.println("Salário Bruto: ");
        info.salario = entrada.nextDouble();

        System.out.println("Desconto do funcionario: ");
        info.taxa = entrada.nextDouble();

        System.out.println("Funcionário: " + info.nome + ", Salário R$ " + info.salario);
        System.out.println("Desconto do funcionario: R$ " + info.taxa);
        System.out.println("Atualização: " + info.nome + ", Salário Líquido: R$ " + info.salarioLiq());


        entrada.close();
    }
}
