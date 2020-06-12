package atividade20200612.atividadeBimestre.AssocMtosPMtos;

// - Uma associação 0..* para 0..* bidirecional.

public class App {

	public static void main(String[] args) {

		Seguradora porto = new Seguradora("Porto Seguro");
		Seguradora itau = new Seguradora("Itau");
		
		Cotacao cot1 = new Cotacao(777);
		Cotacao cot2 = new Cotacao(999);
		
		porto.adicionarCotacao(cot1);
		porto.adicionarCotacao(cot2);
		
		itau.adicionarCotacao(cot2);
		
		/*System.out.println("Seguradora: " + porto.getNomeSeguradora());
		for (Cotacao cotacoes : porto.getCotacoes()) {
			System.out.println(cotacoes.getValorFinal());
		}
		
		System.out.println("Seguradora: " + itau.getNomeSeguradora());
		for (Cotacao cotacoes : porto.getCotacoes()) {
			System.out.println(cotacoes.getValorFinal());
		}
		
		System.out.println("#-------------------------------------#");
		
		System.out.println("Cotação: " + cot1.getValorFinal());
		for (Seguradora seguradoras : cot1.getSeguradoras()) {
			System.out.println(seguradoras.getNomeSeguradora());
		}
		
		System.out.println("Cotação: " + cot2.getValorFinal());
		for (Seguradora seguradoras : cot2.getSeguradoras()) {
			System.out.println(seguradoras.getNomeSeguradora());
		}*/
		
		apresentarSeguradoras(porto);
		apresentarSeguradoras(itau);
		System.out.println("#-------------------------------------#");
		apresentarCotacao(cot1);
		apresentarCotacao(cot2);
	}
	private static void apresentarSeguradoras(Seguradora seguradora) {
		System.out.println("Seguradora: " + seguradora.getNomeSeguradora());
		for (Cotacao cotacoes : seguradora.getCotacoes()) {
			System.out.println(cotacoes.getValorFinal());
		}
		System.out.println();
	}
	
	private static void apresentarCotacao(Cotacao cotacao) {
		System.out.println("Cotação: " + cotacao.getValorFinal());
		for (Seguradora seguradoras : cotacao.getSeguradoras()) {
			System.out.println(seguradoras.getNomeSeguradora());
		}
		System.out.println();
	}

}
