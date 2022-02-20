package capgemini_desafio.capgemini_desafio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import capgemini_desafio.capgemini_desafio.questao02.Questao02;

public class Questao_02Test {
	
	//Testando o retorno dos caracteres faltantes, simbolo e tamanho da senha.
	@Test
	public void testeSenha() {
		
		String esperado = "3\n" + 
				"Não tem simbolo!\n" + 
				"Senha pequena! Deve ter no mínimo 6 caracteres.\n";
		
		assertEquals(esperado, Questao02.validarSenha("Ya3"));
		
	}
	
	//O teste verifica o tamanho minimo se tem, letras maiusculas, minusculas e simbolo
	@Test
	public void testeCaracteresMinimos() {
		
		String esperado = "2\n" + 
				"Não tem maiuscula!\n" + 
				"Não tem minuscula!\n" + 
				"Não tem simbolo!\n" + 
				"Senha pequena! Deve ter no mínimo 6 caracteres.\n";
		
		assertEquals(esperado, Questao02.validarSenha("1234"));
		
	}
	
	//Esse teste valida se falta simbolo na senha
	@Test
	public void testeValidaSimbolo() {
		String esperado = "Não tem simbolo!\n";
		
		assertEquals(esperado, Questao02.validarSenha("Dreamt48"));
	}
	
	//Esse teste valida se falta numero na senha
		@Test
		public void testeValidaNumero() {
			String esperado = "Não tem numero!\n";
			
			assertEquals(esperado, Questao02.validarSenha("Dreamt@"));
		}
	
	//Testando falha no teste.
	@Test
	public void testeFalhaValidacaoSenha() {
		String esperado = "3\n" + 
				"Não tem simbolo!\n" + 
				"Senha pequena! Deve ter no mínimo 6 caracteres.\n";
		
		assertNotEquals(esperado, Questao02.validarSenha("Ya3s"));
	}

}
