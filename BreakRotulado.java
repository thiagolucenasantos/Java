package controle;

public class BreakRotulado {
	
	//CUIDADO AO USAR ESSE TIPO DE BREAK, NÃO USUAL NORMALMENTE
	public static void main(String[] args) {
		
	externo: for (int i = 0; i < 3; i++) {  //nomeado o laço for para colocar no break
			for (int j = 0; j < 3; j++) {
				if(i == 1) {
				break externo;	// não entra no laço j	
				}
				System.out.printf("[%d %d]", i, j);
			}
		}
	System.out.println();
	}
}
