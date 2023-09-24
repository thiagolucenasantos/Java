package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
	
		String s = "texto"; //forma mais utilizada de atribuição para uma classe
		
		String a = new String("Texto");//outra forma de atribuição, mas menos usual, porém tem seu propósito
		a.toUpperCase();
		
		//Wrappers são a versão objeto dos tipos primitivos
		int b = 123;
		System.out.println(b);
	}
}
