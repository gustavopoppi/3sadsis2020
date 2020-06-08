package aula20200608.duvidas;

public class AppDuvidas {

	public static void main(String[] args) {
		
		Pessoa aluna = new Pessoa("Ana");
		Pessoa avalista1 = new Pessoa("Joaquim");
		Pessoa avalista2 = new Pessoa("Joana");
		
		Pessoa[] avalistas = {avalista1, avalista2};
		
		ContratoEducacional contratoDaAna = new ContratoEducacional(aluna, avalistas);		

		System.out.println("Contratante");
		System.out.println(contratoDaAna.getContratante().getNome());
		System.out.println("Avalista");
		for (Pessoa avalista : contratoDaAna.getAvalistas()) {
			System.out.println("  " + avalista.getNome());
		}
	}

}
