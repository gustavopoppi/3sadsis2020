package aula20200626.heranca;

public class Tigre extends Animal implements Vertebrado{

	@Override
	public void locomover() {
		System.out.println("Locomovendo tigre");
	}

	@Override
	public void alimentar() {
		System.out.println("Alimentando tigre");
	}

	@Override
	public void formarOssos() {
		System.out.println("Formando ossos tigre");
		
	}

}
