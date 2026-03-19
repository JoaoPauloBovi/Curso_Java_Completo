package Entities;

public class Conversor {

    static double iof = 0.06;

    public static double dollarPrice(double valor, double A) {
        return valor * A;
    }

    public static double includeIof(double valor) {
        return valor * (1 + iof);
    }

    public static String msgIof() {
        return "Iof Price: 6%;";
    }
}
