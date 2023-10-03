package lambdas.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import lambdas.Produto;



public class Consumidor {
	
	public static void main(String[] args) {
		//função Consumer recebe apenas um parâmetro e não retorna nada
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.05);
		imprimirNome.accept(p1);// passando o Consumer para imprimir manualmente
		
		Produto p2 = new Produto("Notebook", 5449, 0.25);
		Produto p3 = new Produto("Caderno", 15, 0.4);
		Produto p4 = new Produto("Borracha", 5.99, 0.2);
		Produto p5 = new Produto("Lapis", 18.99, 0.4);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		// utlizando automaticamente o Consumer no forEach
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println( p.preco));
		produtos.forEach(System.out::println);
	}

}
