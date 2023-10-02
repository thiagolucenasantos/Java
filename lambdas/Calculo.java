package lambdas;

@FunctionalInterface //indica que é uma interface funcional
public interface Calculo {
	
	public abstract double executar(double a, double b);

}


// innterface funcionais possuem somente uma função
// caso tenha mais de uma gerará um erro
