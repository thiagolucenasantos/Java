package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	//ler num1
	//ler num 2
	//usuário escolher o tipo de operação + - * / %
	//mostrar resultado de acordo com a escolha da operação
	
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
		String op = entrada.next();
		
		//lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op)? num1 - num2 : resultado;
		resultado = "*".equals(op)? num1 * num2 : resultado;
		resultado = "/".equals(op)? num1 / num2 : resultado;
		resultado = "%".equals(op)? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
	}

}
