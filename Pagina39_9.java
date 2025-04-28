package atividade;

import java.util.Scanner;

public class Pagina39_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salario;
        double irrf;

        System.out.println("Digite o salário do empregado:");
        salario = in.nextDouble();

        if (salario <= 1434.59) {
            irrf = 0;
            System.out.println("Salário até R$ 1434.59: Isento de IRRF");
        } else if (salario >= 1434.60 && salario <= 2150.00) {
            irrf = (salario * 0.075) - 107.59;
            System.out.println("Salário entre R$ 1434.60 e R$ 2150.00: IRRF = R$ " + (irrf * 100) / 100.0);
        } else if (salario >= 2150.01 && salario <= 2866.70) {
            irrf = (salario * 0.15) - 268.84;
            System.out.println("Salário entre R$ 2150.01 e R$ 2866.70: IRRF = R$ " + (irrf * 100) / 100.0);
        } else if (salario >= 2866.71 && salario <= 3582.00) {
            irrf = (salario * 0.225) - 483.84;
            System.out.println("Salário entre R$ 2866.71 e R$ 3582.00: IRRF = R$ " + (irrf * 100) / 100.0);
        } else {
            irrf = (salario * 0.275) - 662.94;
            System.out.println("Salário acima de R$ 3582.00: IRRF = R$ " + (irrf * 100) / 100.0);
        }

        in.close();
    }
}