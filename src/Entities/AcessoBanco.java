package Entities;

public class AcessoBanco {
    public static String Name;
    public static double numeroConta;
    public double saldo;

    public AcessoBanco() {

    }

    public AcessoBanco(String Name, double numeroConta) {
        this.Name = Name;
        this.numeroConta = numeroConta;
    }

    public AcessoBanco(String Name, double numeroConta, double saldo) {
        this.Name = Name;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void setName(String name) {
        Name = name;
    }

    public void getName(String name) {
        Name = name;
    }

    public double taxa(double A) {
        A = 5.00;
        this.saldo = saldo - A;
        return saldo;
    }

    public double deposito(double valor) {
        saldo += valor;
        return saldo;
    }

    public double saque(double valor) {
        saldo -= valor;
        return saldo;
    }

}
