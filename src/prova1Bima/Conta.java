package prova1Bima;

public class Conta {

	private double saldo; // vari�vel declarada no corpo da classe

	public void depositar(double valor) { // valor seria vari�vel na declara��o do m�todo ou poderia fazer o mesmo tipo em um construtor alternativo
		this.saldo += valor;
	}
	
	public double getRendimento(double saldo) {
		double rendimento = 0.05; // essa vari�vel seria a terceira, onde eu declaro ela no corpo do m�todo
		
		return rendimento*saldo;		
	}
}
