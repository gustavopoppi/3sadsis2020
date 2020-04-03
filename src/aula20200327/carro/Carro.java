package aula20200327.carro;

public class Carro {

	private double combustivelNoTanqueEmLitros;
	private boolean ligado;
	private final static double CONSUMO = 0.250;

	public Carro(double combustivelNoTanqueEmLitros) {
		this.combustivelNoTanqueEmLitros = combustivelNoTanqueEmLitros;
		ligado = false;
	}

	public void abastecer(double volumeEmLitros) {
		combustivelNoTanqueEmLitros += volumeEmLitros;
	}

	public void ligar() {
		if (combustivelNoTanqueEmLitros - CONSUMO >= 0.00) {
			ligado = true;
			combustivelNoTanqueEmLitros -= CONSUMO;
		}
	}

	public void desligar() {
		ligado = false;
	}

	public void acelerar() {
		if (combustivelNoTanqueEmLitros - CONSUMO >= 0.00) {
			combustivelNoTanqueEmLitros -= CONSUMO;
		}	
		else
			desligar();
	}

	public boolean isLigado() {
		return ligado;
	}

	public boolean isDesligado() {
		return !isLigado();
	}
	
	public double getCombustivelEmLitros() {
		return this.combustivelNoTanqueEmLitros;
	}
	
	public void setEsvaziarCombustivelNoTanque() {
		combustivelNoTanqueEmLitros = 0;
	}
}
