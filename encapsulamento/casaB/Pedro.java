package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{ //relacionamento de herança
	
void testeAcesso(){
		
//	Ana amiga = new Ana(); não precisa instanciar porque estárecebendo atributos por herança e atributos públicos
		//segredo 
		//facoDentroDeCasa 
		//formaDeFalar 
		//todosSabem
		
		System.out.println(amiga.segredo);// não visualizado por ser privado
		System.out.println(amiga.facoDentroDeCasa);// só é visível para quem está no mesmo pacote
		System.out.println(formaDeFalar);//acessando diretamente não acessando por atribuo, porque recebeu os atributos por herança
		System.out.println(todosSabem);
	}

}
