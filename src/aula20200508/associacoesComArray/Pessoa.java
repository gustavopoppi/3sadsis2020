package aula20200508.associacoesComArray;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	//private Endereço[] endereços = new Endereço[5];
	private ArrayList<Endereco> enderecos = new ArrayList();
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void adicionarEndereço(Endereco e) {
		this.enderecos.add(e);
	}
	public ArrayList<Endereco> getEndereços() {
		return this.enderecos;
	}
//	public Endereço[] getEndereços() {
//		return this.endereços;
//	}

}