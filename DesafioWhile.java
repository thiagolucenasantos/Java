package controle;

import java.util.Iterator;
import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// usuário digita nota válida de 0 a 10
		// armazenar variável total
		// sempre que uma nota for digitada, acrescentar na total e somar todas as notas
		// criar outra variável para contar quantas notas válidas foram digitadas
		// no final mostrar a média
		// para sair -1 sair do programa, caso digite errado incluir mensagem de erro ao
		// sair

		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota ou -1 para sair");
			nota = entrada.nextDouble();
			
			if (nota <=10 && nota >=0) {
				total += nota; //somatória das notas digitadas
				quantidadeDeNotas++; //contando a quantidades de notas digitadas
			}else if(nota != -1) {
				System.out.println("Nota inválida!!");
			}
		}
	    // Calculando a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		entrada.close();
	}
}



