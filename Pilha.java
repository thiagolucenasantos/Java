package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	//conceito de pilha o último que entra é o primeiro que sai
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();//ArrayDeque é um método de pilha
		livros.add("O Hobbit");
		livros.add("O pequeno prícnipe");
		livros.add("Demolidor");
		
		System.out.println(livros.peek()); //imprime na ordem de cima para baixo por conta do add
		
		Deque<String> livros2 = new ArrayDeque<String>();
		livros2.push("livro1");
		livros2.push("livro2");
		livros2.push("livro3");
				
		System.out.println(livros2.peek()); // com o push se comporta como a fila deve ser o último que entra é o primeiro a sair
		System.out.println(livros2.pop());// remove elemento da fila
		System.out.println(livros2.poll());//remove elemento da fila, diferença é o erro após fila vazia
	}
}
