package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Boa dia"; //variável do tipo string é criada com S maiúsculo
		s = s.replace("dia", "tarde");//substituinto bom dia por boa tarde
		s = s.concat(" senhora!!"); //adicinando mais palavras no final da frase
		s = s.toUpperCase();//a variável s recebendo a função de tornar tudo maiúsculo
		
		System.out.println(s);
		
		System.out.println("Thiago".concat(" José"));
		
		String b = "Hoje "
				.concat("estou ")
				.concat("programando em Javascript ")
				.replace("Javascript", "Java");
		System.out.println(b);
	}
}
