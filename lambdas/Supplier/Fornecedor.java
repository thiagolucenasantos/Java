package lambdas.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		//Supplier, não recebe nenhum parâmetro e retorna algo
		//como exemplo usamos uma lista, porém o Supplier pode retornar qualquer outro método
		Supplier<List<String>> lista = 
	   //parenteses vazios, faz parte da sintaxe do Supplier		
				()-> Arrays.asList("Ana", "Lucas");
		System.out.println(lista.get());// get para retornar o resultado da função Supplier
	}
}
