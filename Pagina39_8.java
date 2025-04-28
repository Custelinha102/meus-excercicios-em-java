package atividade;

import java.util.Scanner;

public class Pagina39_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;
        double notaExame;
        double novaMedia;

        System.out.println("Digite a primeira nota do aluno:");
        nota1 = in.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media < 3) {
            System.out.println("Média: " + media);
            System.out.println("Aluno REPROVADO");
        } else if (media >= 6) {
            System.out.println("Média: " + media);
            System.out.println("Aluno APROVADO");
        } else {
            System.out.println("Média: " + media);
            System.out.println("Aluno em EXAME");
            System.out.println("Digite a nota do EXAME:");
            notaExame = in.nextDouble();
            novaMedia = (media + notaExame) / 2;
            if (novaMedia >= 6) {
                System.out.println("Nova média: " + novaMedia);
                System.out.println("Aluno APROVADO");
            } else {
                System.out.println("Nova média: " + novaMedia);
                System.out.println("Aluno REPROVADO");
            }
        }

        in.close();
    }
}