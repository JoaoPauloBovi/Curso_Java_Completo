package Application;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        Produto p2 = new Produto("Notebook", 4500.20);
        p2.desconto = 0.25;

        Produto p3 = new Produto("Notebook", 4500.20, 0.5);

        /* var p3 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 12.50;
        p2.desconto = 0.29; */

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
        double precoFinal3 = p3.preco * (1 - p3.desconto);

        System.out.printf("Preco: %.2f%n", precoFinal);
        System.out.printf("Preco: %.2f%n", precoFinal2);
        System.out.printf("Preco: %.2f%n", precoFinal3);

    }
}
