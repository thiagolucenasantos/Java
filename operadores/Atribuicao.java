package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		//forma diferente de atribuição
		c += b; // mesma coisa de c = c + b 
		c -= a; // mesma coisa de c = c - a  
		c *= b; // mesma coisa de c = c * b  
		c /= a; // mesma coisa de c = c / a 
		
		System.out.println(c);
		
		c %= 2; //c = c % 2; resultado 0 ou 1, para é 0 impar é 1
		System.out.println(c);
	}

}
