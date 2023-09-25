package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; // variável local,ou seja criada dentro do escopo de obterDataFormatada, não
											// pode ser utilizada em outros locais, somente aqui
		return String.format(formato, this.dia, mes, ano);
	}

	// construtor padrão (default)
	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(01, 01, 1970); // chamando um método construtor dentro de outro método construtor
	}

	Data(int dianovo, int mesnovo, int anonovo) {
		this.dia = dianovo; // referenciando com o this diretamente o método construtor
		this.mes = mesnovo;
		this.ano = anonovo;
	}
}
