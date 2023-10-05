package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1
		a--; // a = a - 1
		
		b++; //b = b + 1 
		b--; //b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); 
		// a resposta aqui é true por que o incremento antes da letra ex. a++
		//transforma o a=2 e o b, ainda é 2 então é verdade, somente após 
		//a comparação que o b recebe o decremento b--
		
		System.out.println(a == b); //agora ele imprime falso que o b agora é 1
		System.out.println(a);
		System.out.println(b);
	}

}
