package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // o L no final do número significa que ele ultrapassou o valor de int e agora é long
		
		//Tipos numéricos reais
		float salario = 11_445.44F; // o F no final demonstra que esse valor é do tipo float
		double vendasAcumuladas = 2_991_229_387.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		//Tipo caractere
		char status = 'A'; //tipo caractere aceita somente uma letra
		
		System.out.println(anosDeEmpresa *365);
		System.out.println(numerosDeVoos / 2);		
		System.out.println(pontosAcumulados / vendasAcumuladas);		
		System.out.println(id + ": ganha -> " + salario);		
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status" + status);
		
	}
}
