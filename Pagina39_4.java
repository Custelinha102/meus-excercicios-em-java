package atividade;

import java.util.Scanner;

public class Pagina39_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        double delta, x1, x2;

        System.out.println("Digite o valor de A:");
        a = in.nextDouble();

        System.out.println("Digite o valor de B:");
        b = in.nextDouble();

        System.out.println("Digite o valor de C:");
        c = in.nextDouble();

        delta = (b * b) - (4 * a * c);

        System.out.println("O valor de delta é: " + delta);

        if (delta < 0) {
            System.out.println("Não existem raízes reais para a equação.");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Existe apenas uma raiz real: " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Existem duas raízes reais:");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }

        in.close();
    }
}
