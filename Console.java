package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.println("Bom");//por causa do ln do println, o comando imprime e quebra linha
		System.out.println("dia");
		
		System.out.print("Bom ");// sem o ln ele imprime, mas não quebra linha, permanecendo tudo na mesma linha
		System.out.print("dia\n"); // \n quebra de linha
		
		
		//printf formatado atribui a caracteres especiais os valores
		
		System.out.printf("Megasena: %d %d %d %d %n", 1, 2, 3, 4);// %n também quebra linha
		System.out.printf("Salário: %.1f %n", 547.876); //%.1f irá mostrar uma casa decimal após o ponto arredondado
		
		//disparo após rodar o programa irá ficar aguardando até que se digite o nome
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite seu idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos. %n",nome, sobrenome, idade);
		
		entrada.close(); // fechando o Scanner some a mensagem de alerta, isso determina o final para não ficar consumindo processamento e carregando sem motivo

	}

}
