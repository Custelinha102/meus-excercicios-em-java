package atividade;

import java.util.Scanner;

public class Pagina39_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome1;
        int idade1;
        String nome2;
        int idade2;
        String nome3;
        int idade3;
        String nome4;
        int idade4;
        String nome5;
        int idade5;
        String nomeMaisVelho;
        int idadeMaisVelho;
        String nomeMaisNovo;
        int idadeMaisNovo;

        System.out.println("Digite o nome do usuário 1:");
        nome1 = in.next();
        System.out.println("Digite a idade do usuário 1:");
        idade1 = in.nextInt();

        System.out.println("Digite o nome do usuário 2:");
        nome2 = in.next();
        System.out.println("Digite a idade do usuário 2:");
        idade2 = in.nextInt();

        System.out.println("Digite o nome do usuário 3:");
        nome3 = in.next();
        System.out.println("Digite a idade do usuário 3:");
        idade3 = in.nextInt();

        System.out.println("Digite o nome do usuário 4:");
        nome4 = in.next();
        System.out.println("Digite a idade do usuário 4:");
        idade4 = in.nextInt();

        System.out.println("Digite o nome do usuário 5:");
        nome5 = in.next();
        System.out.println("Digite a idade do usuário 5:");
        idade5 = in.nextInt();

        nomeMaisVelho = nome1;
        idadeMaisVelho = idade1;

        if (idade2 > idadeMaisVelho) {
            idadeMaisVelho = idade2;
            nomeMaisVelho = nome2;
        }
        if (idade3 > idadeMaisVelho) {
            idadeMaisVelho = idade3;
            nomeMaisVelho = nome3;
        }
        if (idade4 > idadeMaisVelho) {
            idadeMaisVelho = idade4;
            nomeMaisVelho = nome4;
        }
        if (idade5 > idadeMaisVelho) {
            idadeMaisVelho = idade5;
            nomeMaisVelho = nome5;
        }

        nomeMaisNovo = nome1;
        idadeMaisNovo = idade1;

        if (idade2 < idadeMaisNovo) {
            idadeMaisNovo = idade2;
            nomeMaisNovo = nome2;
        }
        if (idade3 < idadeMaisNovo) {
            idadeMaisNovo = idade3;
            nomeMaisNovo = nome3;
        }
        if (idade4 < idadeMaisNovo) {
            idadeMaisNovo = idade4;
            nomeMaisNovo = nome4;
        }
        if (idade5 < idadeMaisNovo) {
            idadeMaisNovo = idade5;
            nomeMaisNovo = nome5;
        }

        System.out.println("Usuário mais velho: " + nomeMaisVelho + " - " + idadeMaisVelho + " anos");
        System.out.println("Usuário mais novo: " + nomeMaisNovo + " - " + idadeMaisNovo + " anos");

        in.close();
    }
}