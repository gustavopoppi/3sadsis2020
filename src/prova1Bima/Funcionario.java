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

	// b) um m�todo modificador que receba uma String e um boolean
	public void setAlterarDepto(String nomeNovoDept, boolean aumento) {
		if (aumento)
			setAumentoSalario(5);

		this.departamento = nomeNovoDept;
	}

	public void setAumentoSalario(double porcentagemAumento) {
		if (porcentagemAumento <= 0 || porcentagemAumento > 100)
			throw new RuntimeException("Valor da porcentagem para aumento de sal�rio inv�lida!");

		this.salario += (1 + porcentagemAumento);
	}

	public void demitir() {
		if (!setDemissao())
			throw new RuntimeException("Funcion�rio j� n�o possui mais v�nculo com a empresa");
	}

	// c) um m�todo modificador que n�o receba valores mas que retorne verdadeiro ou
	// falso.
	public boolean setDemissao() {
		if (contratado) { // caso tenha v�nculo ele pode ser demitido;
			this.contratado = false;
			return true;
		}
		return false;
	}

	// a) um m�todo de obten��o que retorne um valor do estado do objeto
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
