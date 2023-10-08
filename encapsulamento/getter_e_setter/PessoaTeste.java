package oo.encapsulamento.getter_e_setter;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Thiago", "Souza", -50);
		p1.setIdade(-2000);
		
		System.out.println(p1);
		System.out.println(p1.getnomeCompleto());
	}
}
