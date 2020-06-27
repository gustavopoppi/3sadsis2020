package aula20200626.heranca;

public class Minhoca extends Animal implements Invertebrado{

	@Override
	public void locomover() {
		System.out.println("Locomovendo minhoca");
	}

	@Override
	public void alimentar() {
		System.out.println("Alimentando minhoca");
	}

}
