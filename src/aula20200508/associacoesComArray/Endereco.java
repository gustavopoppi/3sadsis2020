package aula20200508.associacoesComArray;

public class Endereco {
	private String logradouro;
	private String numero;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public String getNumero() {
		return numero;
	}

	public Endereco(String logradouro, String numero) {
		this.logradouro = logradouro;
		this.numero = numero;
	}
}