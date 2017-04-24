package exercRevisaoP1ACMEAIR;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ListaDeBagagensTest {
	
	private ListaDeBagagens lista;
	
	@Before
	public void setUp(){
		lista = new ListaDeBagagens();
		BagagemNormal.setCustoFixo(10);
		lista.add(new BagagemNormal(22,"Bagagem Normal 1"));
		lista.add(new BagagemFragil(23,"Bagagem Fragil 1"));
		lista.add(new BagagemDeMao(10,"Bagagem de Mao 1"));		
	}
	
	@Test
	public void testGetTotalBagagensDeMao(){
		lista.add(new BagagemDeMao(4,"Bagagem de Mao 2"));	
		int expected = 2;
		int actual = lista.getTotalBagagensDeMao();
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void testCustoTotal(){
		lista.custoTotal();
		double expected = 130;
		double actual = lista.custoTotal();
		assertEquals(expected, actual, 0.1);
	}

}
