package atividade;

import java.util.Scanner;

public class Pagina38_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double litro, distancia;

        System.out.println("Qual a capacidade do tanque de combustível do seu carro em litros?");
        litro = in.nextDouble();

        System.out.println("Agora digite a distância que pretende percorrer em quilômetros:");
        distancia = in.nextDouble();

        double gasto = distancia / litro;

        System.out.println("O consumo em km por litro é de " + gasto);
        if (gasto >= 10) {
            System.out.println("O carro é econômico, fica em paz.");
        } else {
            System.out.println("O carro não é econômico, sinto muito.");
        }

        in.close();
    }
}
