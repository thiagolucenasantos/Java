package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		// tipo nome intanciando mesmo nome do tipo
		Produto p1 = new Produto(); // Produto() é um método
		p1.nome = "Notebook";
		p1.preco = 2000.00;
		
		Produto.desconto = 0.50; // alterando o desconto de todos os produtos que pertencem a classe Produto
		
		System.out.println(p1.precoComDesconto());

		var p2 = new Produto("Celular", 654.89); // recebendo parâmetro String do segundo construtor
		p2.nome = "Celular";
		p2.preco = 645.34;

		System.out.println(p2.precoComDesconto());

		Produto p3 = new Produto("Notebook", 1500.00);
		System.out.println(p3.precoComDesconto());

		// System.out.println(p1.nome);
		// System.out.println(p2.nome);

		//
		// double mediaCarrinho = (precoFinal1 + precoFinal2) /2;

		// System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);

	}
}
