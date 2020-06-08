package aula20200601.associacoes;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private ArrayList<Endereço> enderecos = new ArrayList<>();

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Endereço> getEnderecos() {
		return enderecos;
	}
	
	public void addEndereço(Endereço e) {
//		if (this.endereços.contains(e)) {
//			return;
//		}
		System.out.println("Adicionando novo endereço à pessoa: " + e.toString());
		this.enderecos.add(e);
		e.addMorador(this);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}	
}
