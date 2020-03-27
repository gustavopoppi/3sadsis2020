package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesCarro {

	@Test
	void desligarCarroAutomaticamenteCasoEstejaSemCombustivel() {
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
	void desligarCarroCasoNaoTenhaCombustivelQuandoAcelerar() {
		Carro carro = new Carro();
		
		carro.abastecer(5);
		carro.ligar();
		for (int i = 0; i < 20; i++) {
			carro.acelerar();
		}
		
		assertEquals(false, carro.isLigado());
		assertEquals(false, carro.isDesligado());
	}
	
	
	
	
}
