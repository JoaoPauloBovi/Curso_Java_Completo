package Application;

import Entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = entrada.nextLine();

        System.out.print("Price: ");
        product.price = entrada.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = entrada.nextInt();



        System.out.println(product.name + " ," + product.price + " ," + product.quantity);

        entrada.close();
    }
}
