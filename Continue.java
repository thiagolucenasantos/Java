package controle;

public class Continue {

	public static void main(String[] args) {

		// continue interrompe somente aquela interação na condição,
		// enquanto o break sai do bloco em que está e vai direto para a próxima linha
		// de código
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		// outro exemplo
		for (int i = 0; i < 8; i++) {
			if (i == 4) { //irá pular o 4 e continuar a contagem
				continue;
			}
			System.out.println(i);
		}
	}
}
