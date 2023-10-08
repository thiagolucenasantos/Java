package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcesso(){
		
		//segredo 
		//facoDentroDeCasa 
		//formaDeFalar 
		//todosSabem
		
		//System.out.println(esposa.segredo); não visualizado por ser privado
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	
	}
}
