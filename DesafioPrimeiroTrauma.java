package classe;

public class DesafioPrimeiroTrauma {

	int a = 3;
	static int b = 5;

	public static void main(String[] args) {
		// criando uma instancia de nome p para ter acesso a variável a fora do main
		DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();
		System.out.println(p.a);

		// podemos acessar a variável diretamente por se tratar de uma static
		System.out.println(b);
	}
}
