package aula20200529.localidadeAssocBidirecional;

public class Estado {
	
	public String nome;
	public String sigla;
	public int codigoDDD;
	private Pais pais;
	
	public Estado(String nome, Pais pais, String sigla, int codigoDDD) {
		this.nome = nome;
		this.pais = pais;
		this.sigla = sigla;
		this.codigoDDD = codigoDDD;
		this.pais.addEstado(this);
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
	
	public Pais getPais() { // qual é o país
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
