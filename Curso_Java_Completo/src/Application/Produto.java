package Application;

public class Produto {
    String nome;
    double preco;
    double desconto;


//    Produto() { Construtor Padrão
//    }

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }

    Produto(String nomeInial, double precoInicial) {
        nome = nomeInial;
        preco = precoInicial;
    }

    Produto(String nomeInial, double precoInicial, double descontoInicial) {
        nome = nomeInial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

}
