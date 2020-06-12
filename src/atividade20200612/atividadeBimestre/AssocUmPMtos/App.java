package atividade20200612.atividadeBimestre.AssocUmPMtos;

// - Uma associação 1 para 1..* unidirecional;

public class App {

	public static void main(String[] args) {

		Cliente clienteA = new Cliente("cliente A");
		
		Endereco end1 = new Endereco("rua teste, 95");
		Endereco end2 = new Endereco("rua teste2, 105");

		
		clienteA.adicionarEndereco(end1);
		clienteA.adicionarEndereco(end2);
		
		System.out.println("Endereços do cliente " + clienteA.getNomeCliente() + ":");
		for (Endereco endereco : clienteA.getEnderecos()) {
			System.out.println(endereco.getRuaOuAvenida());
		}
	}

}
