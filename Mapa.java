package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>(); //HashMap método para utilizar no Map
		
		//no método map não temos o .add para adicionar elementos
		//mas sim p .put ele tanto adiciona como altera dados na mesma posição
		
		usuarios.put(1, "Roberot");
		usuarios.put(1, "Gustavo"); //alterando a mesma posição
		usuarios.put(2, "Maria");
		usuarios.put(3, "João");
		
		System.out.println(usuarios.size()); //tamanho
		System.out.println(usuarios.isEmpty()); //está vazio ou não
		
		System.out.println(usuarios.keySet()); //mostra as chaves do Map
		System.out.println(usuarios.values());//mostra os valores do Map
		System.out.println(usuarios.entrySet());//motra os dois chaves e valores
		
		System.out.println(usuarios.containsKey(3));//verificando se existe a chave, true ou false
		System.out.println(usuarios.containsValue("Ricardo"));//verificando se existe o nome
		
		System.out.println(usuarios.get(3));//Mostrando o elemento pela sua posição
		
		for (int chave : usuarios.keySet()) { // percorrendo o Map pelas chaves
			System.out.println(chave);
		}
		
		for (String valor : usuarios.values()) { //percorrendo o Map pelos valores, no caso aqui os nomes
			System.out.println(valor);
		
		//percorre o Map mostrando suas chaves e valores	
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
		}
	}

}
