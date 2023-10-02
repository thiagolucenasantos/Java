package lambdas;

public class CalculoComLambda {
	
	public static void main(String[] args) {
		
		Calculo soma = (a, b) -> { 
			return a + b;
		};
		System.out.println(soma.executar(3, 5));
		
		soma = (x, y) -> x * y; //forma de lambda simplificada 
		System.out.println(soma.executar(2, 5));
		
	}
	
	
}
