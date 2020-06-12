package atividade20200612.atividadeBimestre.AssocUmPUm;

/*A atividade de vocês valendo 1,5 (um ponto e meio) consiste projetar e implementar um modelo de sua escolha que apresente:

- Uma associação 1 para 0..1 bidirecional;
*/

public class App {

	public static void main(String[] args) {
		Cpf cpfGustavo = new Cpf();
		
		Pessoa gustavo = new Pessoa(cpfGustavo);
		
		System.out.println("Pessoa: " + cpfGustavo.getPessoa());
		System.out.println("CPF: " + gustavo.getCpf());
	}
}
