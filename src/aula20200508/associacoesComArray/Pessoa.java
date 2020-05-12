package aula20200508.associacoesComArray;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	//private Endere�o[] endere�os = new Endere�o[5];
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
	
	public void adicionarEndere�o(Endereco e) {
		this.enderecos.add(e);
	}
	public ArrayList<Endereco> getEndere�os() {
		return this.enderecos;
	}
//	public Endere�o[] getEndere�os() {
//		return this.endere�os;
//	}

}