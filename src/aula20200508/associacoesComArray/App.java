package aula20200508.associacoesComArray;

public class App {
	
	public static void main(String[] args) {
		Pessoa ciclano = new Pessoa("Ciclano de Tal", 22);
		
		Endereco casaDoCiclano = new Endereco("Av. Brasil", "425a");
		Endereco escritórioDoCiclano = new Endereco("Av. Guedner", "1225");
		
		ciclano.adicionarEndereço(casaDoCiclano);
		ciclano.adicionarEndereço(escritórioDoCiclano);
		
		System.out.println("Ciclano possui " + ciclano.getEndereços().size() + " endereço(s)");
		
		for (int i = 0; i < ciclano.getEndereços().size(); i++) {
			Endereco e = ciclano.getEndereços().get(i);
			System.out.println(e.getLogradouro() + ", " + e.getNumero());
		}
	}

}