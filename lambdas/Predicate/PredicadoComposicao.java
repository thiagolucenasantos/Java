package lambdas.Predicate;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		// Predicate: recebe um parÂmetro e retorna verdadeiro ou falso
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.test(22));
		System.out.println(isTresDigitos.test(30));
		
		//concatenando os dois Predicate
		System.out.println(isPar.and(isTresDigitos).test(341));//se é par ou impar e tem 3 digitos
		System.out.println(isPar.or(isTresDigitos).test(280));// é par ou tem 3 dígitos então é verdadeiro
	}

}
