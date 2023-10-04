package lambdas.Predicate;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		//lambda Predicate da biblioteca Java
		//Predicate sempre retorna verdadeiro ou falso
		Predicate<Produtos> isCaro = prod ->(prod.preco *(
				1 - prod.desconto)) >=750;
		Produtos produto = new Produtos("Notebook", 1500.44,0.15 );
		Produtos roupas = new Produtos ("Camisa", 25.00, 0.05);
		System.out.println(isCaro.test(produto)); // acima de 750,00 :verdadeiro
		System.out.println(isCaro.test(roupas));// abaixo de 750,00:falso
	}

}
