package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesCarro {

	@Test
	void ligarCarroEAcelerarCasoTenhaCombustivel() {
		Carro carro = new Carro();
		
		carro.abastecer(2); // 2 Litros de gasolina
		
		carro.ligar();
		carro.acelerar();
		
		assertEquals(true, carro.isLigado());
		assertEquals(true, carro.isDesligado());
		assertEquals(1.5, carro.combustivelNoTanqueEmLitros);
	}

	@Test
	void naoLigarCarroCasoNaoTenhaCombustivelSuficiente() {
		Carro carro = new Carro();
		
		carro.abastecer(0.2);
		carro.ligar();
		
		assertEquals(false, carro.isLigado());
		assertEquals(false, carro.isDesligado());
	}
	
	@Test
	void desligarCarroCasoNaoTenhaCombustivel() {
		Carro carro = new Carro();
		
		carro.abastecer(2.2);
		carro.ligar();
		for (int i = 0; i <= 7; i++) { // sobra de 0.2 litros no tanque
			carro.acelerar();
		}
		
		assertEquals(false, carro.isLigado());
		assertEquals(false, carro.isDesligado());
	}
	
	
	
	
}
