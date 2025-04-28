package atividade;

import java.util.Scanner;

public class Pagina38_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Digite seu peso em quilos:");
        peso = in.nextDouble();

        System.out.println("Digite sua altura em metros:");
        altura = in.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Excesso de Magreza");
        } else if (imc >= 18.5 && imc <= 25) {
            System.out.println("Classificação: Peso Normal");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Classificação: Excesso de Peso");
        } else if (imc > 30 && imc <= 35) {
            System.out.println("Classificação: Obesidade (Grau I)");
        } else if (imc > 35 && imc <= 40) {
            System.out.println("Classificação: Obesidade (Grau II)");
        }

        in.close();
    }
}
