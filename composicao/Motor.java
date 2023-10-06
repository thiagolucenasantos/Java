package oo.composicao;

public class Motor {

	boolean ligado = false;
	double injecao = 1;
	
	int giros() {
		if (!ligado) {
			return 0;
		}else {
			return (int) Math.round(injecao * 3000); //math.round arredonda o valor
		}
	}
	
}
