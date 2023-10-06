package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();//inicializando o método Carro
		
		System.out.println(c1.estaLigado());
		
		c1.ligar(); //ligando o carro
		System.out.println(c1.estaLigado());
		
		//mostrando a quantidade de giros do motor atualmente
		System.out.println(c1.motor.giros());
		
		//aumentando a quantidade de giros
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		
		System.out.println("Acelerou: " + c1.motor.giros());
		
		//diminuindo a quantidade de giros
		c1.frear();
		System.out.println("Freou: " + c1.motor.giros());
		
		
	}
}
