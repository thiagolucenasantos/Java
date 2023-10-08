package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia extends Ana{ //relacionamento de herança
	

void testeAcesso(){
		
	Ana irma = new Ana();
		//segredo 
		//facoDentroDeCasa 
		//formaDeFalar 
		//todosSabem
		
		//System.out.println(esposa.segredo); não visualizado por ser privado
		System.out.println(irma.facoDentroDeCasa); // não tem acesso,não está no mesmo pacote
		System.out.println(irma.formaDeFalar); // não consegue acesso porque não está utilizando a forma de Herança como o Pedro
		System.out.println(irma.todosSabem);
	}
}
