package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na terça (V ou falso)
		//Trabalho na quinta (V ou falso)
		//Se apenas um trabalho der certo, comprar TV 32 polegadas
		// Se os dois derem certo comprar TV 50 polegadas
		//Nos dois casos a família irá tomar sorvete também
		// Se os dois trabalhos não derem certo a família irá ficar em casa
		
		//SOLUÇÃO DO PROFESSOR
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean ComprouTV50 = trabalho1 && trabalho2;
		boolean ComprouTV35 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//operador unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\" ? " +ComprouTV50);
		System.out.println("Comprou TV 50\" ? " +ComprouTV35);
		System.out.println("Comprou TV 50\" ? " +comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
		
				
		/*
		//Minha solução
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		System.out.println(trabalho1 && !trabalho2);
		
		if (trabalho1 && trabalho2) {
		System.out.println("Vamos comprar uma TV de 50 e tomar sorvete");
		}else if (trabalho1 && !trabalho2){
			System.out.println("Vamos comprar a TV de 32 polegadas e tomar sorvete");
		}else 
			System.out.println("Vamos ficar em casa e com fome");
			
		*/
		
	}

}
