package arrays;

import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas");
		
		int qtdeNotas = entrada.nextInt();//captura de números
				
		double[] notas = new double [qtdeNotas];//capturando no array a variável int o número digitado 
						
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Infome quantidade de notas: " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A média é "+ media + "!");
						
		entrada.close();
	}
}
