package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número:");
		
		int numero = Integer.parseInt(valor);//transformando String em inteiro
		
		if (numero % 2 == 0) { //calculando o resto da divisão
			System.out.println("Número par!!");
		}else {
			System.out.println("Número impar!!");
		}
	}
}
