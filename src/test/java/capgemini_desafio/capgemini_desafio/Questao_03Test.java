package capgemini_desafio.capgemini_desafio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import capgemini_desafio.capgemini_desafio.questao03.Questao03;

public class Questao_03Test {
	
	
	@Test
	public void testeQuantidadeAnagramas() {
		
		assertEquals(2, Questao03.quantidadeAnagramas("ana"));
	}
	
	@Test
	public void testeFalha() {
		assertNotEquals(5, Questao03.quantidadeAnagramas("ana"));
	}
	
	 @Test
	    public  void  testeVerificaSeAnagrama (){
	        assertEquals( true , Questao03.verificaSeAnagrama("na", "an")); 
	}
	 
	 @Test
	    public  void  testeFalhaVerificaSeAnagrama (){
	        assertNotEquals( true , Questao03.verificaSeAnagrama("nu", "an")); 
	}
	 

}
