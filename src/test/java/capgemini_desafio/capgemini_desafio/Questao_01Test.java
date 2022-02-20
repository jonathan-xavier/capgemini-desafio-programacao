package capgemini_desafio.capgemini_desafio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import capgemini_desafio.capgemini_desafio.questao01.Questao01;

/**
 * Unit test for simple App.
 */
public class Questao_01Test 
{
    @Test
	public void testeEscada() {
		String esperado = "     *\n" +
							"    **\n" +
							"   ***\n" +
							"  ****\n" +
							" *****\n" +
							"******";
		assertEquals(esperado, Questao01.criaEscada(6));
	}

	
	 @Test
	   public void testeFalhaEscada() {
	      String esperado = "  *\n" + " **\n" + "***";
	      assertNotEquals(esperado, Questao01.criaEscada(4));
	   }
}
