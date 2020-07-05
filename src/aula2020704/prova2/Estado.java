package aula2020704.prova2;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoDDD;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (codigoDDD != other.codigoDDD)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		return true;
	}	
}