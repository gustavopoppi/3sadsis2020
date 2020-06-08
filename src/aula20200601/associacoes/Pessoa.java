package aula20200601.associacoes;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private ArrayList<Endere�o> enderecos = new ArrayList<>();

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Endere�o> getEnderecos() {
		return enderecos;
	}
	
	public void addEndere�o(Endere�o e) {
//		if (this.endere�os.contains(e)) {
//			return;
//		}
		System.out.println("Adicionando novo endere�o � pessoa: " + e.toString());
		this.enderecos.add(e);
		e.addMorador(this);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}	
}
