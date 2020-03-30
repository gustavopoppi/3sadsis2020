package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesCarro {

	@Test
	void testarConsumo() {
		Carro palioABC3333 = new Carro(0);
		Carro golAGJ1234 = new Carro(0);

		assertTrue(palioABC3333.isDesligado());
		assertTrue(golAGJ1234.isDesligado());

		palioABC3333.abastecer(10);
		golAGJ1234.abastecer(25);

		palioABC3333.ligar();
		assertEquals(9.75, palioABC3333.getCombustivelEmLitros());

		golAGJ1234.ligar();
		assertEquals(24.75, golAGJ1234.getCombustivelEmLitros());

		palioABC3333.acelerar();
		palioABC3333.acelerar();
		palioABC3333.acelerar();
		assertEquals(9.00, palioABC3333.getCombustivelEmLitros());

		golAGJ1234.acelerar();
		assertEquals(24.5, golAGJ1234.getCombustivelEmLitros());
	}

	@Test
	void desligarCarroAutomaticamenteComCombustivelInsuficiente() {
		Carro palioABC3333 = new Carro(0);

		palioABC3333.abastecer(1);
		palioABC3333.ligar();

		palioABC3333.acelerar();
		palioABC3333.acelerar();
		palioABC3333.acelerar();
		palioABC3333.acelerar();

		// combustível chegando em 0;
		assertFalse(palioABC3333.isLigado());
		assertTrue(palioABC3333.isDesligado());

		Carro golAGJ1234 = new Carro(0.95);

		golAGJ1234.ligar();
		golAGJ1234.acelerar();
		golAGJ1234.acelerar();

		// combustível no tanque = 0.200ml
		assertTrue(golAGJ1234.isLigado());
		assertFalse(golAGJ1234.isDesligado());
	}

	@Test
	void reabastecerCarro() {
		Carro palioABC3333 = new Carro(0);
		
		palioABC3333.abastecer(20);
		
		palioABC3333.ligar();
		palioABC3333.acelerar();
		palioABC3333.acelerar();
		palioABC3333.acelerar();		

		palioABC3333.abastecer(6);
		
		assertEquals(25, palioABC3333.getCombustivelEmLitros());
	}
	
	@Test
	void naoLigarCarroCasoCombustivelForInsuficiente() {
		Carro palioABC3333 = new Carro(0);

		palioABC3333.abastecer(0.2);
		palioABC3333.ligar();

		assertEquals(false, palioABC3333.isLigado());
		assertEquals(true, palioABC3333.isDesligado());
	}

}
