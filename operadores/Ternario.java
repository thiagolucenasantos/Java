package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		//é uma atribuição com condicional
		
		double media = 6;
		//se for verdadeiro retorno Aprovado, caso não seja retorna reprovado
		String resultado = media >= 7.0 ? "aprovado." : "em recuperação.";
		
		System.out.println("O aluno está " + resultado);
	}
}
