package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		//Domingo -> 1, segunda =2, terça = 3, quarta =4, quinta=5
		//sexta = 6, sabado = 7
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		
		String semana = entrada.next();//next pega uma única palavra, nextline várias palavras
		
		if(semana.equalsIgnoreCase("domingo")) { //equalsIgnoreCase, ignora letras maiúsculas e minúsculas
			System.out.println("Número 1");
		}else if(semana.equals("segunda") || semana.equals("Segunda")){
			System.out.println("Numero 2");
		}else if(semana.equals("terça") || semana.equals("Terça")){
			System.out.println("Numero 3");
		}else if(semana.equals("quarta") || semana.equals("Quarta")){
			System.out.println("Numero 4");
		}else if(semana.equals("quinta") || semana.equals("Quinta")){
			System.out.println("Numero 5");
		}else if(semana.equals("sexta") || semana.equals("Sexta")){
			System.out.println("Numero 6");
		}else if(semana.equals("sábado") || semana.equals("Sábado")){
			System.out.println("Numero 7");
		}else {
			System.out.println("Dia inválido");
		}
		
			System.out.println("Boa semana");
		
		
		entrada.close();
	}
}
