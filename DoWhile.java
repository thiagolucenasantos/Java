package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.println("Você precisa falar as palavras mágicas");
			System.out.println("Gostaria de sair? ");
			texto = entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Volte sempre");
		entrada.close();
	}
}
