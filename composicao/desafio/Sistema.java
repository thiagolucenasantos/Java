package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Maria Julia");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 2.55, 38);
		compra1.adicionarItem("Notebook", 1598.00, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 3);
		compra2.adicionarItem("TV", 1200.00, 1);
		
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.nome);
		System.out.println(cliente.obterValorTotal());
	}

}
