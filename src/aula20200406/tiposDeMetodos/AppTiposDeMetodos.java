package aula20200406.tiposDeMetodos;

public class AppTiposDeMetodos {

	public static void main(String[] args) {
		// DIA
		// Declaração, Instanciação, Atribuição
		Pessoa maria = new Pessoa("Maria das Graças", 22, 54, 1.62);
		/*maria.setNome("Maria das Graças");
		maria.setIdade(22);
		maria.setPeso(54);
		maria.setAltura(1.62);*/

		// DIA
		// Declaração, Instanciação, Atribuição
		Pessoa jose = new Pessoa("José de Alencar", 32, 92, 1.75);
		/*jose.setNome("José de Alencar");
		jose.setIdade(32);
		jose.setPeso(92);
		jose.setAltura(1.75);*/

		System.out.println(maria.getNome() + ", IMC=" + maria.getIMC());
		System.out.println(jose.getNome() + ", IMC=" + jose.getIMC());
	}

}
