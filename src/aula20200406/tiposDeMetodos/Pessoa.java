package aula20200406.tiposDeMetodos;

import javax.management.RuntimeErrorException;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;

	public Pessoa(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getIMC() {
		return peso / (altura * altura);
	}

	// Olha um getter aqui!
	public String getNome() {
		return this.nome;
	}

	// Olha um setter aqui!
	public void setNome(String nome) {
		if (nome == null || nome.trim().equals("")|| nome.length() == 1) {
			throw new RuntimeException("O nome não poder ser nulo ou ser vazio ou ter só uma letra.");
		}
		this.nome = nome;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		if (altura < 0.25) {
			throw new RuntimeException("Altura não pode ser menor que 25cm");
		}
		this.altura = altura;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new RuntimeException("Peso deve ser maior que zero!");
		}
		this.peso = peso;
	}
}
