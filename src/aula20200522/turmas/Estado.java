package aula20200522.turmas;

public class Estado {
	
	public String nome;
	public String sigla;
	public int codigoDDD;
	
	public Estado(String nome, String sigla, int codigoDDD) {
		this.nome = nome;
		this.sigla = sigla;
		this.codigoDDD = codigoDDD;
	}
	
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
	public int getCodigoDDD() {
		return codigoDDD;
	}	
	
}
