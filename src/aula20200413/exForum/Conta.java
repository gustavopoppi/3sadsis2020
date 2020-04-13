package aula20200413.exForum;

public class Conta {
	
	private int agencia;
	private int numero;
	private double saldo;
	private int senha;
	
	// Construtor padr�o
	public Conta() {		
	}
	
	// Construtor alternativo;
	public Conta(int agencia, int numero, int senha) {
		setAgencia(agencia);
		setNumero(numero);
		setSenha(senha);
	}

	public int getAgencia() {
		return agencia;
	}

	// Um dos m�todos modificadores
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	// Um dos m�todos de acesso com o retorno de um atributo
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	private void setSenha(int senha) {
		this.senha = senha;
	}
	
	// item 2.5 e 2.6
	public double getRendimentoInvestimento(int senha) {
		if (validaSenha(senha)) {
			return this.saldo * 0.05;
		}
		throw new RuntimeException("Senha inv�lida");
	}
	
	private boolean validaSenha(int senha) {
		return senha == this.senha;
	}

}