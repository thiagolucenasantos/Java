package lambdas.OperadorUnario;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		//tipo de parâmetro de entrada é o mesmo que é retornável
		
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;
		
		System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0));
		
		int exemplo2 = aoQuadrado
				.compose(vezesDois)// compose significa que antes da operação a frente ele irá fazer esta operação
				.compose(maisDois) // no exemplo está de trás para frente o cálculo
				.apply(0); //o apply é o que da start ao UnaryOperator
		System.out.println(exemplo2);
	}

}
