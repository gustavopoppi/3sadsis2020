package aula20200323.cofre;

public class AppCofre {

	public static void main(String[] args) {
		// N�o � poss�vel invocar o m�todo a partir da classe pois ele n�o � est�tico!
		// Cofre.fechar()

		Cofre cofreDaSala = new Cofre();
		Cofre cofreDoBanco = new Cofre();

		cofreDoBanco.abrir();

		cofreDaSala.abrir();
		cofreDaSala.fechar();

		System.out.println("Da sala: " + cofreDaSala.isAberto());
		System.out.println("Do banco: " + cofreDoBanco.isAberto());
	}
}
