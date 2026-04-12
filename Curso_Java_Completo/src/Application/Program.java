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

        System.out.println();
        System.out.println("Product Data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be addes in stock: ");
        int quantity = entrada.nextInt();
        product.AddProducts(quantity);

        System.out.println();
        System.out.println("Update Data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = entrada.nextInt();
        product.RemoveProducts(quantity);

        System.out.println();
        System.out.println("Update Data: " + product);


        entrada.close();
    }
}
