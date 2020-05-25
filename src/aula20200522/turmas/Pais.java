package aula20200522.turmas;

import java.util.ArrayList;

public class Pais {

	public String nome;
	public int codigoDDI;
	public ArrayList<Estado> estados = new ArrayList<>();
	public int qtdeEstado = 0;
	
	public Pais(String nome, int codigoDDI) {
		this.nome = nome;
		this.codigoDDI = codigoDDI;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoDDI() {
		return codigoDDI;
	}
	
	public void addEstado(Estado e) {
		this.estados.add(e);
		this.qtdeEstado++;
	}
	
	public ArrayList<Estado> getEstados(){
		return this.estados;
	}

	public int contarEstado() {
		return this.qtdeEstado;
	}
}
