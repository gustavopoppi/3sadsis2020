package prova1Bima;

public class AppMain {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(); 
		Cliente clienteNaoInicializado;
		Cliente clienteReferenciadoUm = cliente;
		Cliente clienteReferenciadoDois = cliente;
		
		System.out.println("Cliente original: " + cliente);
		System.out.println("Cliente referenciado um: " + clienteReferenciadoUm);
		System.out.println("Cliente referenciado dois: " + clienteReferenciadoUm);
	}

}
