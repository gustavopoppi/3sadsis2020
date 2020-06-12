package atividade20200612.atividadeBimestre.AssocMtosPMtos;

import java.util.ArrayList;

public class Cotacao {

	private float valorFinal;
	
	private ArrayList<Seguradora> seguradoras = new ArrayList<Seguradora>();
	
	public Cotacao(float valorFinal) {
		setValorFinal(valorFinal);
	}

	public void adicionarSeguradora(Seguradora seguradora) {
		if (this.seguradoras.contains(seguradora)) {
			return;
		}
		this.seguradoras.add(seguradora);
		seguradora.adicionarCotacao(this);
	}
	
	public float getValorFinal() {
		return valorFinal;
	}
	
	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	public ArrayList<Seguradora> getSeguradoras() {
		return seguradoras;
	}
}
