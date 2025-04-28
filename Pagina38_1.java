package atividade;
	import java.util.Scanner;
public class Pagina38_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dataNasc, anoAtual;
		
		System.out.println("em qual ano voce nasceu?");
		dataNasc = in.nextInt();
		
		anoAtual=2025;
		int idade = anoAtual - dataNasc;
		
		if (idade < 10) {
			System.out.println("isso significa que voce tem " +idade+ " anos. voce é criança");
	}	else if (idade >= 10 && idade < 18) {
		System.out.println("isso significa que voce tem " +idade+ " anos. voce é Adolescente");
	}	else if (idade >= 18 && idade < 60) {
		System.out.println("isso significa que voce tem " +idade+ " anos. voce é adulto");
	}	else {
		System.out.println("isso significa que voce tem " +idade+ " anos. voce é idoso");
	}
		
		
	}

}
