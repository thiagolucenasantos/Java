package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data(): null; //exemplo para caso seja menor que 0.5 será null
		
		if(d1 != null) { //condição caso a variável possa ser null para não gerar erro de runtime
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
			
		}
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat("????"));
		}
	}

}
