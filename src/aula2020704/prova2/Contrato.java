package aula2020704.prova2;

public class Contrato {

	private Servico servico;
	
	public Contrato(Servico servico) {
		this.servico = servico;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((servico == null) ? 0 : servico.hashCode());
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
		Contrato other = (Contrato) obj;
		if (servico == null) {
			if (other.servico != null)
				return false;
		} else if (!servico.equals(other.servico))
			return false;
		return true;
	}
}
