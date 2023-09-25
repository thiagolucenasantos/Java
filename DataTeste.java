package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data aniversario = new Data(); // recebendo os dados do construtor default setado
		//aniversario.dia = 0;
		//aniversario.mes = 0;
	//	aniversario.ano = 0;
		
		var thiago = new Data(20, 02, 1960); //recebendo valores de acordo com método construtor
	//thiago.dia = 30;
	//	thiago.mes = 05;
	//	thiago.ano = 1456;
		
		System.out.println("Aniversário por default é: " + aniversario.obterDataFormatada());
		System.out.println("O aniversario de Thiago é: "+thiago.dia+"/"
		+thiago.mes+"/"+thiago.ano);
		//método mais fácil e melhot de se fazer o print acima
		
	}
	
}
