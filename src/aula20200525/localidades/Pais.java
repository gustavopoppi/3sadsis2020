package aula20200525.localidades;

import java.util.ArrayList;

public class Pais {
	private String nome;
	private int c�digoDDI;
	private ArrayList<Estado> estados = new ArrayList<>();

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
		for (Estado estadoExistente : estados) {
			if (estadoExistente.getSigla().equals(e.getSigla())) {
				return;
			}
		}
		this.estados.add(e);		
	}
	public ArrayList<Estado> getEstados() {
		return estados;
	}
	public int contaEstados() {
		return this.estados.size();
	}

}