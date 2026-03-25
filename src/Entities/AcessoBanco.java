package Entities;

public class AcessoBanco {
    private String Name;
    private double numeroConta;
    private double saldo;


    public AcessoBanco(String Name, double numeroConta) {
        this.Name = Name;
        this.numeroConta = numeroConta;
    }

    public AcessoBanco(String Name, double numeroConta, double depositoInicial) {
        this.Name = Name;
        this.numeroConta = numeroConta;
        deposito(depositoInicial);
    }

    public void setName(String name) {
        Name = name;
    }

    public void getName(String name) {
        Name = name;
    }

    public void getNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void getsaldo() {
        saldo = saldo + numeroConta;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor + 5.0;
    }

    public String toString() {
        return "Conta "
                + numeroConta
                + ", nome: "
                + Name
                + ", Saldo R$ "
                + String.format("%.2f", saldo);
    }
}
