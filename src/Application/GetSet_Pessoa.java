package Application;

import Entities.GetSet;

public class GetSet_Pessoa {
    public static void main(String[] args) {

        GetSet p1 = new GetSet("joao", "bovi", 30);
        p1.setIdade(300);

        System.out.println(p1.getIdade());
        System.out.println(p1);
        System.out.println(p1.getNomeCompleto());

    }
}
