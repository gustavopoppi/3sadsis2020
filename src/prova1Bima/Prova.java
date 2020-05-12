package prova1Bima;

public class Prova {
	
	private String nomeDisciplina;
	private double valorProva;

	public Prova(String nomeDisciplina, double valorProva) {
		setNomeDisciplina(nomeDisciplina);
		setValorProva(valorProva);
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		if (nomeDisciplina == null || nomeDisciplina.trim().equals(""))
			throw new RuntimeException("O nome não pode nulo ou ser vazio. ");
		
		this.nomeDisciplina = nomeDisciplina;
	}

	public double getValorProva() {
		return valorProva;
	}

	public void setValorProva(double valorProva) {
		if(valorProva < 0 || valorProva > 10)
			throw new RuntimeException("Valor da nota tem que estar entre 0.00 e 10. ");
		
		this.valorProva = valorProva;
	}
}
