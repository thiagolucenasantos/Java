package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true; //verdadeiro
		boolean condicao2 = 3 > 7; //falso
		
		System.out.println(condicao1 && condicao2 ); //&& = e, resultado falso
		System.out.println(condicao1 || condicao2 ); // usando ou = vardedeiro
		System.out.println(condicao1 ^ condicao2 ); // ou exclusivo = verdadeiro
		System.out.println(!condicao1);//negando a condição 1 = falso
		System.out.println(!condicao2);//negando a condição 2 = verdadeiro
		System.out.println(!!condicao1 );//dupla negação resultado = verdadeiro
		System.out.println(condicao1 && !condicao2 );//misturando condições = verdadeiro
		
		//Tabela verdade E (AND)
		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//Tabela verdade OU (OR)
				System.out.println("Tabela verdade OU (OR)");
				System.out.println(true || true);
				System.out.println(true || false);
				System.out.println(false || true);
				System.out.println(false || false);
			
		//Tabela verdade OU Eclusivo (XOR)
		System.out.println("Tabela verdade OU (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//Tabela verdade NOT (NOT)
		System.out.println("Tabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
	}

}
