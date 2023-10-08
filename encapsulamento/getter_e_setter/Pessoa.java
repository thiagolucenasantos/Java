package oo.encapsulamento.getter_e_setter;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;

	public Pessoa(String nome,String sobrenome, int idade) { // passando atributo dentro () do contrutor para poder modificar
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);; // na classe main após instanciar
	}

	//Método Getter
	public int getIdade() { // métodp para alterar idade passando o mesmo tipo inteiro
		return idade; // retornando somente a idade
	}

	//Método Set (que faz alteração)
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);//caso seja digitado valor negativo, essa regra aplicará a idade positivamente
		if (novaIdade >= 0 && novaIdade <= 100) {
			this.idade = novaIdade;
		}
	}
	

	//Get e Set de nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	//Get e Set sobrenome
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	//getter sem atributo relacionado
	public String getnomeCompleto() {
		return getNome() + " " + getSobrenome() ;
	}

	public String toString() {
		return "Olá meu nome é " + getNome()+ " e tenho " + getIdade();
		
	}
	
}
