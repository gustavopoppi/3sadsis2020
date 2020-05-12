package prova1Bima;

public class AppMain {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(); 
		Cliente clienteNaoInicializado;
		Cliente clienteReferenciadoUm = cliente;
		Cliente clienteReferenciadoDois = cliente;		
		
		Prova prova = new Prova("TESTE", 10);
		
		Funcionario novoFuncionario = new Funcionario("Carlos", "Tecnologia", 1000);
		
		System.out.println(novoFuncionario.getSalario());
		novoFuncionario.setAlterarDepto("Adm", true);
		System.out.println(novoFuncionario.getSalario());
		
		novoFuncionario.demitir();
		System.out.println(novoFuncionario.isContratado());
		novoFuncionario.demitir();
	}

}
