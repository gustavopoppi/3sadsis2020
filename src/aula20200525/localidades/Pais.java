package aula20200525.localidades;

import java.util.ArrayList;
import java.util.HashSet;

public class Pais {

	public String nome;
	public int codigoDDI;
	public HashSet<Estado> estados = new HashSet<>();
	
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
	}
	
	public HashSet<Estado> getEstados(){
		return this.estados;
	}

	public int contarEstado() {
		return estados.size();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
