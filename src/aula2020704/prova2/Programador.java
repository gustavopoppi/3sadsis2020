package aula2020704.prova2;

public class Programador extends Funcionario {

	public Programador(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double getBonificacao() {
		return 200;		
	}

}
