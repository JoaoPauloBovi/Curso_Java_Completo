package Application;

import java.util.Arrays;

public class ExercicioArrays {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        System.out.printf("Média do aluno: %.2f%n", total / notasAlunoA.length);


        double[] notasAlunoB = {5.0, 7.5, 8.6, 10.0};

        double totalB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalB += notasAlunoB[i];
        }
        System.out.printf("Média do aluno: %.2f%n", totalB / notasAlunoB.length);

    }
}
