package aula2020704.prova2;

public class Diretor extends Funcionario {
	
	

	public Diretor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonificacao() {
		return this.getSalario();	
	}

}
