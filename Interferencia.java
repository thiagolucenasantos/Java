package fundamentos;

public class Interferencia {

	public static void main(String[] args) {
		
		//se não declarada o tipo de variável o próprio java irá inferir pelo que você atribuiu
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		//não se pode trocar o tipo de variável, mesmo que o java que tenha inferido
		c = "Novo texto";
		System.out.println(c);
		
		double d; //variável declarada
		d = 124; // variável foi inicializada
		System.out.println(d); //usada
	}
}
