package aula2020704.prova2;

import java.util.HashSet;

public class Pais {
	private String nome;
	private int c�digoDDI;
	private HashSet<Estado> estados = new HashSet<>();

	public Pais(String nome, int codigoDDI) {
		this.nome = nome;
		this.c�digoDDI = codigoDDI;
	}
	public String getNome() {
		return nome;
	}
	public int getCodigoDDI() {
		return c�digoDDI;
	}
	public void addEstado(Estado e) {		
		this.estados.add(e);		
	}
	public HashSet<Estado> getEstados() {
		return estados;
	}
	public int contaEstados() {
		return this.estados.size();
	}

}