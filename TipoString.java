package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
	System.out.println("Olá pessoal".charAt(6)); // podemos utilizar ad funções de . mesmo sem ter definido a variável antes
	
	String s = "Boa tarde"; // não podemos alterar o valor inicial, a String é imutável
	System.out.println(s.concat("!!!"));
	System.out.println(s + "!!!"); //faz a mesma coisa de que a linha acima
	System.out.println(s.startsWith("Bom")); //retorne true ou false, se o valor corresponde ou não com a variável em pesquisa
	System.out.println(s.endsWith("tarde"));//se termina com tarde será true
	System.out.println(s.length());//mostra o tamanho da string
	System.out.println(s.equals("boa tarde"));//comparação se é igual
	System.out.println(s.equalsIgnoreCase("boa tarde"));//aqui a mesma função acima, porém ignorando letras maiúscula e minúsculas
	
	var nome = "Thiago";
	var sobrenome = "Jose";
	var idade = 33;
	var salario = 8000.38;
	
	System.out.println("Nome " + nome + "\nSobrenome: "
	+ sobrenome + "\nIdade: " + idade + "\nsalario: "
			+ salario + "\n\n");
	
	//podemos substituir o código a cima por este
	System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.",
			nome, sobrenome, idade, salario);
	
	//podemos colocar o cósigo acima dentro de uma variável para ser reutilizavel
	String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.",nome, sobrenome, idade, salario);
	System.out.println(frase);
	
	System.out.println("Hoje o dia está bonito".lastIndexOf("b")); //posição de onde inicia a letra b
	System.out.println("Olá pessoal, vamos indo".substring(4)); //inicia-se na possição 4
	
	
	}
}
