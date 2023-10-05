package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		//exemplo para fazer conta elevando um número com potência
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); //aplicando cast porque a função Math.pow é do tipo double
		//ou podemos simplesmete atribuir o tipo double logo no inicio
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		
	//desafio
		

		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1-5) * (2-7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é: " + resultado);
		
		// obs: modo debug, podemos dar dois cliques na barrinha azul a esquerda, irá aparecer uma bolinha de onde
		// o modo debug irá iniciar, após isso só clicar no ícone do bichinho ao lado do ícone de run
		//irá abrir a tela de debur e ir clicando f6 para percorrer as linhas, para parar é f8
		
		//ctrl + shift + f8 escolhe a perspectiva que você quer, também f6, f7 você pode escolher outros atalhos
	}

}
