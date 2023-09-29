package controle;

import java.util.Scanner;

public class SwitchComBreak {

	//Switch utilizado normalmente com break
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.println("Informe sua nota");
		int nota = entrada.nextInt();

		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;

		case 8:	case 7:
			conceito = "B";
			break;

		case 6:
		case 5:
			conceito = "C";
			break;

		case 4:
		case 3:
			conceito = "D";
			break;

		case 2:
		case 1:
			conceito = "E";
			break;
		default:
			conceito = "Conceito não encontrado";

		}
		System.out.println("Conceito é: " + conceito);
		entrada.close();
	}

}
