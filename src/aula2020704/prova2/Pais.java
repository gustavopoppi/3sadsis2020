package aula2020704.prova2;

import java.util.HashSet;

public class Pais {
	private String nome;
	private int códigoDDI;
	private HashSet<Estado> estados = new HashSet<>();

	public Pais(String nome, int codigoDDI) {
		this.nome = nome;
		this.códigoDDI = codigoDDI;
	}
	public String getNome() {
		return nome;
	}
	public int getCodigoDDI() {
		return códigoDDI;
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