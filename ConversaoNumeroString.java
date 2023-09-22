package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		Integer num = 1000;
		System.out.println(num.toString().length());
		//convertendo de Integer para String, agora podemos utilizas a
	   //função .length(), que só está acessivel na variável String
		
		int num1 = 10000;
		System.out.println(Integer.toString(num1).length());
		//transformando diretamente a variável int (primitiva) para ums String
		
		//fazendo o mesmo procedimento acima, porém utilizando concatenação
		
		System.out.println(("" + num).length());
		System.out.println(("" + num1).length());
	}

}
