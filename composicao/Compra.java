package oo.composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	
	//relacão 1 para n uma compra pode ter vários itens
		ArrayList<Item> itens = new ArrayList<Item>();

	double obterValorTotal() {
		double total = 0;
			
		//formula da soma para gerar o total
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
		
	}
	
}
