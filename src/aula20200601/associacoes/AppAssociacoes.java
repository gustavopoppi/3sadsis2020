package aula20200601.associacoes;

public class AppAssociacoes {

	public static void main(String[] args) {
		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Ana");
		nomes.add("Jonas");
		nomes.add("L�cia");
		
		System.out.println("Nomes cont�m Josias? " + nomes.contains("Josias"));
 		System.out.println("Nomes cont�m Ana? " + nomes.contains("Ana"));
		*/
		
		
		Endere�o avGuedner125 = new Endere�o(TipoLogradouro.AVENIDA, "Guedner", "125");
		Endere�o ruaBogota555 = new Endere�o(TipoLogradouro.RUA, "Bogot�", "555a");
		
		Pessoa fulano = new Pessoa("Fulano de Tal");
		Pessoa beltrana = new Pessoa("Beltrana de Tal");
		
		fulano.addEndere�o(avGuedner125);
		//avGuedner125.addMorador(fulano);
		
		beltrana.addEndere�o(avGuedner125);
		//avGuedner125.addMorador(beltrana);
		
		beltrana.addEndere�o(ruaBogota555);
		//ruaBogot�555.addMorador(beltrana);
		
		endere�osDaPessoaNoConsole(fulano);
		endere�osDaPessoaNoConsole(beltrana);
		
		moradoresDoEndere�oNoConsole(avGuedner125);
		
		
	}
	private static void moradoresDoEndere�oNoConsole(Endere�o e) {
		System.out.println();
		System.out.println(">>> Moradores do Endere�o <<<");
		System.out.println(">>> " + e.toString() );
		System.out.println(">>>");
		for (Pessoa morador : e.getMoradores()) {
			System.out.println(morador.toString());
		}
	}
	
	private static void endere�osDaPessoaNoConsole(Pessoa p) {
		System.out.println();
		System.out.println(">>> Endere�os da Pessoa <<<");
		System.out.println(">>> " + p.toString() );
		System.out.println(">>>");
		for (Endere�o e : p.getEnderecos()) {
			System.out.println(e.toString());
		}
	}
}
