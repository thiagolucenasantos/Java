package lambdas.Predicate;

public class Produtos {
	
	public String nome;
	public double preco;
	public double desconto;
	public Produtos(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$ " + preco + precoFinal;
		
	}
	

}
