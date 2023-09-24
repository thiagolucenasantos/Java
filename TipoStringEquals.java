package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	// Melhor forma de se comparar valores dentro de variáveis é utilizando .equals()
	
	public static void main(String[] args) {
		 System.out.println("2" == "2");
		 
		 String s1 = new String("2");
		 System.out.println("2"  == s1);// resultado sem o equals é falso
		 System.out.println("2".equals(s1)); // .equals compara o valor exato que está guardado
		 
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite um número");
		 
		 String s2 = entrada.next();
		 
		 System.out.println("2" == s2.trim()); // resultado sem o equals é falso
		 System.out.println("2".equals(s2.trim())); //resultado com o .equals é true
		 
		 entrada.close();
	}

}
