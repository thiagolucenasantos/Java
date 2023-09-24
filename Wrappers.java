package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		//classes tipo Wrapper
		
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.net());
		Integer i = 10000; //int no tipo primitivo
		Long l = 100000L;  
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Double d= 1234.598;
		System.out.println(d);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//tipo primitivo é char
		Character c = '#'; //com aspas " da erro precisa ser com aspas '
		System.out.println(c);
		
		
		
	}

}
