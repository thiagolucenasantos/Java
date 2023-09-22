package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4; //atribuindo um valor a uma variável do tipo double(real)
		
		//normalmente utiliza-se nomes de constantes com letras maiúsculas
		final double PI = 3.14159; //final indica que essa varíavel não pode ser alterada futuramente
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		//alterando o valor da variável raio, a mesma não precisa declarar seu tipo novamente
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + "m2");
	}

}
