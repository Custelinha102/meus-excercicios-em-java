package atividade;
import java.util.Scanner;
public class Pagina39_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite o valor do lado A:");
        a = in.nextDouble();

        System.out.println("Digite o valor do lado B:");
        b = in.nextDouble();

        System.out.println("Digite o valor do lado C:");
        c = in.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os lados formam um triângulo.");

            if (a == b && b == c) {
                System.out.println("Tipo de triângulo: Equilátero (três lados iguais).");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo de triângulo: Isósceles (dois lados iguais).");
            } else {
                System.out.println("Tipo de triângulo: Escaleno (três lados diferentes).");
            }

        } else {
            System.out.println("Os lados NÃO formam um triângulo.");
        }

        in.close();
    }
}
