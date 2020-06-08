package aula20200605.associacaoUmParaUm;

public class Porta {
	
	private Fechadura fechadura;
	
	public Porta(Fechadura fechadura) {
		if (fechadura == null) {
			throw new RuntimeException("A fechadura é obrigatória para construir uma porta!");
		}
		this.fechadura = fechadura;
		this.fechadura.setPorta(this);
	}
	
	public Fechadura getFechadura() {
		return fechadura;
	}

	
}
