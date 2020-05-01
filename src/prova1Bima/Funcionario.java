package prova1Bima;

public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private boolean contratado;

	public Funcionario(String nome, String departamento, double salario, boolean estaNaEmpresa) {
		setNome(nome);
		setDepartamento(departamento);
		setSalario(salario);
		this.contratado = true;
	}

	// b) um método modificador que receba uma String e um boolean
	public void setAlterarDepto(String nomeNovoDept, boolean aumento) {
		if (aumento)
			setAumentoSalario(5);

		this.departamento = nomeNovoDept;
	}

	public void setAumentoSalario(double porcentagemAumento) {
		if (porcentagemAumento <= 0 || porcentagemAumento > 100)
			throw new RuntimeException("Valor da porcentagem para aumento de salário inválida!");

		this.salario += (1 + porcentagemAumento);
	}

	public void demitir() {
		if (!setDemissao())
			throw new RuntimeException("Funcionário já não possui mais vínculo com a empresa");
	}

	// c) um método modificador que não receba valores mas que retorne verdadeiro ou
	// falso.
	public boolean setDemissao() {
		if (contratado) { // caso tenha vínculo ele pode ser demitido;
			this.contratado = false;
			return true;
		}
		return false;
	}

	// a) um método de obtenção que retorne um valor do estado do objeto
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
