package aula20200529.localidadeAssocBidirecional;

import java.util.ArrayList;
import java.util.HashSet;

public class Pais {

	public String nome;
	public int codigoDDI;
	public ArrayList<Estado> estados = new ArrayList<>(); // atributo de associa��o;
	
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
	
	public void removeEstado(Estado e) {
		this.estados.remove(e);
		e.setPais(new Pais("SEM PA�S",0));
	}
	
	public ArrayList<Estado> getEstados(){ // saber quais s�o os estados
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
