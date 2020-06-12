package atividade20200612.atividadeBimestre.AssocMtosPMtos;

import java.util.ArrayList;

public class Seguradora {

	private String nomeSeguradora;
	private ArrayList<Cotacao> cotacoes = new ArrayList<Cotacao>();
	
	public Seguradora(String nomeSeguradora) {
		super();
		setNomeSeguradora(nomeSeguradora);
	}
	
	public String getNomeSeguradora() {
		return nomeSeguradora;
	}
	
	public void setNomeSeguradora(String nomeSeguradora) {
		this.nomeSeguradora = nomeSeguradora;
	}
	
	public void adicionarCotacao(Cotacao cotacao) {
		if (this.cotacoes.contains(cotacao)) {
			return;
		}
		this.cotacoes.add(cotacao);
		cotacao.adicionarSeguradora(this);
	}
	
	public ArrayList<Cotacao> getCotacoes() {
		return cotacoes;
	}
	
}
