package aula20200525.localidades;

public class Estado {

	private String nome;
	private String sigla;
	private int codigoDDD;

	public Estado(String nome, String sigla, int códigoDDD) {
		this.nome = nome;
		this.sigla = sigla;
		this.codigoDDD = códigoDDD;
	}
	
	public int getCodigoDDD() {
		return codigoDDD;
	}
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
}