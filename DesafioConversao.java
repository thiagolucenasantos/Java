package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro salário");
		String valor1 = scan.nextLine().replace(",", "."); // usuário pode digitar tanto "," quanto ".",que irá funcionar
		
		
		System.out.println("Digite o segundo salário");
		String valor2 = scan.nextLine().replace(",", ".");
		
		
		System.out.println("Digite o terceiro salário");
		String valor3 = scan.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) /3;		
		System.out.printf("A média salarial é:" + media);
		
		
		//fechando o Scanner
		scan.close();
	}
}
