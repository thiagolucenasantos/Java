package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		//resultado de true porque dentro da tabela unicode, toda letra tem seu número
		System.out.println(a == b); 
		
		System.out.println( 3 > 4);
		System.out.println( 3 >= 4);
		System.out.println( 3 < 4);
		System.out.println( 3 <= 4);
		System.out.println( 3 != 4);
		
		double nota = 6;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = passouPorMedia && bomComportamento;
		
		System.out.println("Tem desconto ? " + temDesconto);
		
	}

}
