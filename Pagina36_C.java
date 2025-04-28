package atividade;
	import java.util.Scanner;
public class Pagina36_C {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double f, c;
		
		System.out.println("quantos fahrenheits está fazendo agora?");
		f = in.nextDouble();
		
		c = ((f-32)*5/9);
		
		if (c < 15) {
			
		System.out.println("se voce disse que está fazendo " + f
		+ " fahrenheits, isso significa que "
		+ "a temperatura em graus celsius é de " + c
		+ "°C e isso significa que está frio!");
	}	else if (c >= 15 && c < 22) {
		System.out.println("se voce disse que está fazendo " + f
				+ " fahrenheits, isso significa que "
				+ "a temperatura em graus celsius é de " + c
				+ "°C e isso significa que está ameno");
	}	else {
		System.out.println("se voce disse que está fazendo " + f
				+ " fahrenheits, isso significa que "
				+ "a temperatura em graus celsius é de " + c
				+ "°C e isso significa que está calor");
	}
		
	}

}
