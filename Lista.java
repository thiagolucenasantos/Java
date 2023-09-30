package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<UsuarioLista> lista = new ArrayList<UsuarioLista>();

		UsuarioLista u1 = new UsuarioLista("Ana");
		lista.add(u1);

		lista.add(new UsuarioLista("João"));
		lista.add(new UsuarioLista("Marcelo"));
		lista.add(new UsuarioLista("Ana"));

		System.out.println(lista.get(3)); // acesar pelo indice
		System.out.println(lista.remove(2)); // removendo através do indice
		System.out.println(lista.contains(new UsuarioLista("João"))); // verificando se tem o João na lista

		for (UsuarioLista u : lista) {
			System.out.println(u);
		}

	}

}
