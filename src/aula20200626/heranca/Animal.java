package aula20200626.heranca;

public abstract class Animal {

	public abstract void locomover();
	
	public abstract void alimentar();
	
	public void morrer() {
		System.out.println("Matando animal");
	}
}
