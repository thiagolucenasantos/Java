package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "João";
		c1.itens.add(new Item("Caneta", 2, 10.00));
		c1.itens.add(new Item("borracha", 5, 10.00));
		c1.itens.add(new Item("lápis", 10, 10.00));

		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
		
	}

}
