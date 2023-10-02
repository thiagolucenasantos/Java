package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		//lambda Predicate da biblioteca Java
		Predicate<Produto> isCaro = prod ->(prod.preco *(
				1 - prod.desconto)) >=750;
		Produto produto = new Produto("Notebook", 1500.44,0.15 );
		System.out.println(isCaro.test(produto));
	}

}
