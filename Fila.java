package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	//conceito de fila o primeiro que entra é o primeiro a sair
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();//LinkedList é um método fila 
		
		//offer e add -> adicionam elementos a fila
		//Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); //retorna false
		fila.offer("Ana");// lança uma excessão
		fila.add("Ana");
		fila.offer("Ana");
		fila.add("Ana");
		
		//peek e element -> obter o próximo elemento da fila, sem remover ele
		//Diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.peek());//retorna null caso a fila esteja vazia
		System.out.println(fila.element());//lança uma excesão quando a fila está vazia
		System.out.println(fila.isEmpty());
		
		//poll e remove -> obter o próximo elemento da fila e remover ele.
		System.out.println(fila.poll());  //retorna false quando a fila está vazia
		System.out.println(fila.remove());//retorna uma excesão quando a fila está vazia
		
		
		
		//outros exemplos de métodos
		//fila.size();  mostra o tamanho da fila
		//fila.clear(); limpa a fila
		//fila.isEmpty() retorna true ou false se a fila está vazia ou não
		//fila.contents("nome do elemento") retorna se existe ou não o elemento buscado
	}

}
