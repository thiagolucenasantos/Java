package lambdas.Function;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		// Function recebe dois parâmetros, entrada e resultado

		Function<Integer, String> parOuImpar =
				// recebendo números inteiros e retornando palavras (String)
				numero -> numero % 2 == 0 ? "Par" : "Impar";
		System.out.println(parOuImpar.apply(32)); // utilizando apply para passar o número
		Function<String, String> resultado = valor -> "O valor é: " + valor;
		System.out.println(resultado.apply("Trinta e dois"));

		Function<String, String> empolgado = valor -> valor + "!!!";

		// Concatenando uma função com a outra por se tratarem do retorno ser String
		// é possível ser feito sem gerar erros.
		//a tipo de saída de um método tem que ser a entrada do outro
		String resultadoFinal = parOuImpar.andThen(resultado).andThen(empolgado).apply(33);

		System.out.println(resultadoFinal);

	}
}
