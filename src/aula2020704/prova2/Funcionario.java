package aula2020704.prova2;

public abstract class Funcionario {

	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		setNome(nome);
		setSalario(salario); 
	}
	
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}	
}
