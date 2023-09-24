package fundamentos;

public class temperatura {
	
	public static void main(String[] args) {
		//(°F -32)x 5/9 = °C
		
		//variável iniciando com final mostra que ela não pode ser alterada
		final double AJUSTE = 32;
		final double FATOR = 5/9.0;
		double f = 86;
		double resultado =  (f - AJUSTE) * FATOR;

		//alt + seta para cima ou para baixo move a linha de código
		System.out.println("O resultado é " + resultado + " °C.");
		
		// não precisamos declarar o tipo de varíavel novamente, somente utiliza-la.
		f = 150;
		resultado =  (f - AJUSTE) * FATOR;
		System.out.println("O resultado é " + resultado + " °C.");
		
		

		
	}

}
