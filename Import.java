package fundamentos;

//CTRL + SHIFT + O comando que atualiza nossos importes e sugere se estiver faltando algum

import java.util.Date;

import javax.swing.JButton;

public class Import {
	
	public static void main(String[] args) {
		java.lang.String a = "Bom dia "; //java.lang é o caminho inicial do pacote básico do Java
		java.lang.System.out.println(a);
		
		String b = "Boa tarde";
		System.out.println(b);
		
		Date data = new Date();
		System.out.println(data);
		
		@SuppressWarnings("unused")
		JButton botao = new JButton();
		
	}

}
