package aula20200327.carro;

public class Carro {

	public double combustivelNoTanqueEmLitros;
	private boolean ligado;

	public Carro() {
		combustivelNoTanqueEmLitros = 0;
		ligado = false;
	}

	public void abastecer(double volumeEmLitros) {
		combustivelNoTanqueEmLitros = volumeEmLitros;
	}

	public void ligar() {
		if (combustivelNoTanqueEmLitros >= 0.250) {
			ligado = true;
			combustivelNoTanqueEmLitros -= 0.250;
		}
	}

	public void desligar() {
		ligado = false;
	}

	public void acelerar() {
		// carro estiver ligado e combustível m que 250ml
		if (ligado == true && combustivelNoTanqueEmLitros >= 0.250) {
			combustivelNoTanqueEmLitros -= 0.250;
		}
		if (combustivelNoTanqueEmLitros > 0) 
			ligado = true;	
		else
			ligado = false;
	}

	public boolean isLigado() {
		return ligado;
	}

	public boolean isDesligado() {
		return !ligado;
	}
}
