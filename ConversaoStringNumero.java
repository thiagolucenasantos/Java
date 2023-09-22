package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
		
		System.out.println(("Aqui ele não irá simar, apenas concatenar: " + valor1 + valor2));
		
		double numero1 = Double.parseDouble(valor1); //transformando double em String com .parseDouble
		double numero2 = Double.parseDouble(valor2);
		
		System.out.println(numero1 + numero2);
	}
}
