package aula20200626.heranca;

public class Aguia extends Animal implements Vertebrado{

	@Override
	public void locomover() {
		System.out.println("Locomovendo aguia");
	}

	@Override
	public void alimentar() {
		System.out.println("Alimentando aguia");
	}

	@Override
	public void formarOssos() {
		System.out.println("Formando ossos aguia");
		
	}

}
