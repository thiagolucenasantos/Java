package controle;

public class SwitchSemBreak {
	
	//Switch menos usual
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		//sem o break ele percorre todos os casos e somente após percorrer sai do switch
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Muito bom");
		case "azul":
			System.out.println("excelente");	
		case "roxa":
			System.out.println("Está indo bem");	
		}
	}

}
