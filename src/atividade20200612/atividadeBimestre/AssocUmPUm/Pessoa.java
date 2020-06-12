package atividade20200612.atividadeBimestre.AssocUmPUm;

public class Pessoa {
	
	private Cpf cpf;

	public Pessoa(Cpf cpf) {
		if (cpf == null) {
			throw new RuntimeException("Cpf não pode ser nulo");
		}
		this.cpf = cpf;
		this.cpf.setPessoa(this);
	}
	
	public Cpf getCpf() {
		return cpf;
	}	
}
