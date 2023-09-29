package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while (!valor.equalsIgnoreCase("sair")) { //só irá parar de rodas após digitar sair
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}
}
