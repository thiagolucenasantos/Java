package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.67;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);//fazendo um cast alterando o tipo da variável para gerar um valor quebrado
		
		//operador modulo "%" faz o calculo referente ao resto da divisão
		
		System.out.println(a % b);
		System.out.println(4 % 3);
	}

}
