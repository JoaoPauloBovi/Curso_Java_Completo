package Entities;

public class GetSet {

    private String name;
    private String sobrenome;
    private int idade;


    public GetSet(String nome, String sobrenome, int idade) {
        setName(nome);
        setSobrenome(sobrenome);
        setIdade(idade);

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return getName() + " " + getSobrenome();
    }

    public String toString() {
        return "Olá, eu sou o " + getName() + " " + getSobrenome() + " e tenho " + getIdade() + " anos";
    }
}

