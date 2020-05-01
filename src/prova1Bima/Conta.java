package prova1Bima;

public class Conta {

	private double saldo; // variável declarada no corpo da classe

	public void depositar(double valor) { // valor seria variável na declaração do método ou poderia fazer o mesmo tipo em um construtor alternativo
		this.saldo += valor;
	}
	
	public double getRendimento(double saldo) {
		double rendimento = 0.05; // essa variável seria a terceira, onde eu declaro ela no corpo do método
		
		return rendimento*saldo;		
	}
}
