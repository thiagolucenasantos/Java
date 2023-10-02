package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Julio");

		System.out.println("Forma tradicional..");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n Utilizando Lambda ex. 1");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\n Method Reference...");
		//passando a referencia da lista de aprovados com forEach direto para o println
		//porém não consigo personalizar e adicionar nada como em cima
		aprovados.forEach(System.out::println);
		
		//utilizando a função personalizada
		System.out.println("\n Method Reference: Utilizando a função personalizada");
		aprovados.forEach(nome -> meuImprimir(nome));
	
	}	
	
	//fazendo função personalizada para passar por parÂmetro
	
	public static void meuImprimir(String nome) {
		System.out.println("Meu nome é: " + nome);
	}

}
