package classe;

public class Produto {  //definindo a tipo da classe para ser utilizada posteriormente

	//atributos
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//definindo um construtor padrão, não recebe nenhum parâmetro ()
	//construtores não retornam tipos
	//construtores tem o mesmo nome das classes
	
	Produto(){
		
	}
	
	//definindo outro construtor com recebimento de parâmentro
	Produto (String nomeInicial,double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	
	//adicionando um método para ser utilizado na classe ProdutoTeste
	//não está recebendo nenhum parâmentro nos () porque tenho tudo que precisa
	//nos atributos
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
