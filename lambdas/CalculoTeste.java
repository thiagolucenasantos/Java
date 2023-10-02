package lambdas;

public class CalculoTeste {
	
	//modo tradicional
	public static void main(String[] args) {
		
		Calculo calculo = new Soma();		
		System.out.println(calculo.executar(2, 5));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 5));
	}

}
