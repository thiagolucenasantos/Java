package controle;

import java.awt.Window.Type;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//fazer o mesmo laço acima porém sem utilizar números
		for(String v = "#"; !v.equals("######"); v += "#") {
		System.out.println(v);
		}
	}
}
