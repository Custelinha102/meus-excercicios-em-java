package atividade;

import java.util.Scanner;

public class Pagina39_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Digite o primeiro valor:");
        a = in.nextDouble();

        System.out.println("Digite o segundo valor:");
        b = in.nextDouble();

        System.out.println("Digite o terceiro valor:");
        c = in.nextDouble();

        double menor, meio, maior;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);

        in.close();
    }
}