package atividade20200612.atividadeBimestre.AssocUmPMtos;

import java.util.ArrayList;

public class Cliente {

	private String nomeCliente;
	
	private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
	
	public Cliente(String nomeCliente) {
		super();
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
	
	public void adicionarEndereco(Endereco e){
		this.enderecos.add(e);
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
}
