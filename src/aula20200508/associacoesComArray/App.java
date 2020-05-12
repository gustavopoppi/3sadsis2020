package aula20200508.associacoesComArray;

public class App {
	
	public static void main(String[] args) {
		Pessoa ciclano = new Pessoa("Ciclano de Tal", 22);
		
		Endereco casaDoCiclano = new Endereco("Av. Brasil", "425a");
		Endereco escrit�rioDoCiclano = new Endereco("Av. Guedner", "1225");
		
		ciclano.adicionarEndere�o(casaDoCiclano);
		ciclano.adicionarEndere�o(escrit�rioDoCiclano);
		
		System.out.println("Ciclano possui " + ciclano.getEndere�os().size() + " endere�o(s)");
		
		for (int i = 0; i < ciclano.getEndere�os().size(); i++) {
			Endereco e = ciclano.getEndere�os().get(i);
			System.out.println(e.getLogradouro() + ", " + e.getNumero());
		}
	}

}