package segunda.aep;

public class Conta {
	
	private int agencia;
	private int numero;
	private double saldo;
	private int senha;
	
	// Construtor alternativo;
	public Conta(int agencia, int numero, int senha) {
		setAgencia(agencia);
		setNumero(numero);
		setSenha(senha);
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia < 0) {
			throw new RuntimeException("Nº agência negativa");
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero < 0) {
			throw new RuntimeException("Número negativo");
		}
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	private void setSenha(int senha) {
		if(senha < 0) {
			throw new RuntimeException("Senha negativa");
		}
		this.senha = senha;
	}
	
	public double getRendimentoInvestimento(int senha) {
		if (validaSenha(senha)) {
			return this.saldo * 0.05;
		}
		throw new RuntimeException("Senha inválida");
	}
	
	private boolean validaSenha(int senha) {
		return senha == this.senha;
	}

}