package lambdas;

import java.util.function.BinaryOperator;

public class CalculoComOutroParametro {
	
	public static void main(String[] args) {
		
// metodo lambda pego no site https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
		
		//interface funcional definida pelo java
		BinaryOperator<Double> soma = (a, b) -> { 
			return a + b;
		};
		System.out.println(soma.apply(3.0, 5.0));
		
		soma = (x, y) -> x * y; //forma de lambda simplificada 
		System.out.println(soma.apply(2.0, 5.0));
		
		BinaryOperator<Integer> soma2 = (a, b) -> { 
			return a + b;
		};
		System.out.println(soma2.apply(3, 5));
		
		soma = (x, y) -> x * y; //forma de lambda simplificada 
		System.out.println(soma2.apply(2, 5));
		
	}
	
	
}
