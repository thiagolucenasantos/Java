package oo.abstrato;

public class TesteAbstrato {
	public static void main(String[] args) {
		Mamifero a = new Cachorro(); //instanciando somente o cachorro porque ele é o único que recebeu todos os métodos da classe Animal e Mamifero
		System.out.println(a.mover());
		System.out.println(a.respirar());
		System.out.println(a.mamar()); //instanciando Mamifero que recebeu os parâmetros de Animal também, por isso podemos acessar seus atributos
	}

}
