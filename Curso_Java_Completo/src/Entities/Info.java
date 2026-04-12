package Entities;

public class Info {
    public String nome;
    public double salario;
    public double taxa;

    public double salarioLiq() {
        return salario - taxa;
    }
}
