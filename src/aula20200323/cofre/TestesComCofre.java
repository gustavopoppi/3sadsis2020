package aula20200323.cofre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCofre {

	/* Elabore um método de teste na classe TestesComCofre que garanta que um cofre recém criado esteja FECHADO e que as 
	 * sucessivas chamadas a abrir e fechar deixem o cofre no estado correto (usem o método isAberto para saber o estado atual do cofre).
	 * Usem ao menos 2 cofres no método de teste.
	 * */
	 
	
	@Test
	void verificarCofreRecemCriado() {
	    //Elabore um método de teste na classe TestesComCofre que garanta que um cofre recém criado esteja FECHADO
		Cofre primeiroNovoCofre = new Cofre();
		Cofre segundoNovoCofre = new Cofre();
		
		assertEquals(false, primeiroNovoCofre.isAberto());	
		assertEquals(false, segundoNovoCofre.isAberto());	
	}
	
	@Test
	void verificarCofreAberto() {
		Cofre primeiroNovoCofre = new Cofre();
		Cofre segundoNovoCofre = new Cofre();
		
		primeiroNovoCofre.abrir();
		segundoNovoCofre.abrir();
		
		assertEquals(true, primeiroNovoCofre.isAberto());
		assertEquals(true, segundoNovoCofre.isAberto());
	}
	
	@Test
	void verificarCofreFechado() {
		Cofre primeiroNovoCofre = new Cofre();
		Cofre segundoNovoCofre = new Cofre();
		
		primeiroNovoCofre.fechar();
		segundoNovoCofre.fechar();
		
		assertEquals(false, primeiroNovoCofre.isAberto());
		assertEquals(false, segundoNovoCofre.isAberto());
	}
	
	@Test
	void verificarCofreComSenhaCertaESenhaErrada() {
		CofreSeguro cofreSenhaCerta = new CofreSeguro(123);		
		cofreSenhaCerta.abrir(123);		
		assertEquals(true, cofreSenhaCerta.isAberto());		
		
		CofreSeguro cofreSenhaErrada = new CofreSeguro(123);		
		cofreSenhaCerta.abrir(321);		
		assertEquals(false, cofreSenhaErrada.isAberto());
	}

}
