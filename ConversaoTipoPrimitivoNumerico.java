package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //implícita
		System.out.println(a);
		
		//solução mais cumum para resolver esse valor e dizer que ele é do tipo float
		//float b = 1.23344556786544F; //informando o F no final o java entende que é do tipo float
		
		float b = (float)1.23344556786544;
		System.out.println(b);
		//conversão do tipo explicita (CAST), você informa o tipo de conversão, porém
		//tem ciência de perda de dados como no exemplo acima.
		
		//tipo byte não consegue receber o tipo int, porque escede sua capacidade de armazenamento
		// java não analisa o valor, apenas os tipos
		int c = 340;
		byte d = (byte)c;//conversão explícita (CAST)
		System.out.println(d);
		
		double g = 1.99999;
		int f = (int)g; //(CAST feito porém o resultado é 1, porque a variável int não suporta o que vem após o ponto do float
		System.out.println(f);
		
	}

}
