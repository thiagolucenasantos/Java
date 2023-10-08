package oo.encapsulamento.casaA;

public class Ana {

	@SuppressWarnings("unused")
	private String segredo = "...";//nivel privado ninguem fora da classe consegue ver
	protected String facoDentroDeCasa = "...";//nivel default ou pacote de visualização
	protected String formaDeFalar = "..."; //transmitido por herança e visivel para quem está na mesma casa
	public String todosSabem = "..."; //disponível a todos
}
