package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {

	public static void main(String[] args) {
		//definindo um array de 3 posicões
		double[] notasAluno = new double[4];
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.7;
		notasAluno[3] = 9.7;
		
		//retornando array específico
		System.out.println(notasAluno[1]);
		
		//retornando todos os arrays
		System.out.println(Arrays.toString(notasAluno));
		
		//percorrendo o array
		double totalAlunoA = 0; //inicializando a variável em 0
		for (int i = 0; i < notasAluno.length; i++) {
			totalAlunoA += notasAluno[i]; // operador += soma as notas percorridas no array
		}
		
		System.out.println(totalAlunoA);
		//tirando a média das notas
		System.out.println(totalAlunoA/notasAluno.length);
		
		
		//------------------------------
		
		//declarando um array de outra forma
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		double totalAlunoB = 0; 
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB);
		//média
		System.out.println(totalAlunoB / notasAlunoB.length);

	}
}
