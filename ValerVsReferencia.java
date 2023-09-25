package classe;

public class ValerVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data (1, 5, 2033);
		Data d2 = d1; //atribuição por referência (Objeto)
		
		d1.dia = 30;
		d1.mes = 12;
		d1.ano = 11;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
	
	static void voltarDataParaValorPadrao(Data d) { //dentro do método recebendo a referência
		d.dia = 1;
		d.mes = 3;
		d.ano = 1344;
	}
}
