package aula20200508.associacoesComArray;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	//private Enderešo[] enderešos = new Enderešo[5];
	private ArrayList<Endereco> enderecos = new ArrayList();
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void adicionarEnderešo(Endereco e) {
		this.enderecos.add(e);
	}
	public ArrayList<Endereco> getEnderešos() {
		return this.enderecos;
	}
//	public Enderešo[] getEnderešos() {
//		return this.enderešos;
//	}

}