package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCarro {

	@Test
	void TestarFusca() {
		Carro fusca = new Carro(10);
		assertFalse(fusca.isLigado());

		fusca.abastecer(20.00);
		assertEquals(30, fusca.CombustivelRestante());

		fusca.ligar();
		assertTrue(fusca.isLigado());
		assertEquals(29.75, fusca.CombustivelRestante());

		fusca.Acelerar();
		assertTrue(fusca.isLigado());
		assertEquals(29.50, fusca.CombustivelRestante());

		fusca.desligar();
		assertFalse(fusca.isLigado());
		assertEquals(29.50, fusca.CombustivelRestante());
	}

	@Test
	void TestarFerrari() {
		Carro ferrari = new Carro(0);
		assertFalse(ferrari.isLigado());

		ferrari.abastecer(1);
		assertEquals(1, ferrari.CombustivelRestante());

		ferrari.ligar();
		assertTrue(ferrari.isLigado());
		assertEquals(0.75, ferrari.CombustivelRestante());

		ferrari.Acelerar();
		assertTrue(ferrari.isLigado());
		assertEquals(0.50, ferrari.CombustivelRestante());

		ferrari.Acelerar();
		assertTrue(ferrari.isLigado());
		assertEquals(0.25, ferrari.CombustivelRestante());

		ferrari.Acelerar();
		assertTrue(ferrari.isLigado());
		assertEquals(0.00, ferrari.CombustivelRestante());

		ferrari.Acelerar();
		assertFalse(ferrari.isLigado());
	}


	@Test
	void TestarMarea() {
		Carro marea = new Carro(0);
		assertFalse(marea.isLigado());

		marea.abastecer(0.3);
		assertEquals(0.3, marea.CombustivelRestante());

		marea.ligar();
		assertTrue(marea.isLigado());
		assertEquals(0.05, marea.CombustivelRestante(),0.01);

		marea.desligar();
		assertFalse(marea.isLigado());
		assertEquals(0.05, marea.CombustivelRestante(),0.01);

		marea.ligar();
		assertFalse(marea.isLigado());
		assertEquals(0.05, marea.CombustivelRestante(),0.01);

	}
}





<<<<<<< HEAD













=======
>>>>>>> 86917319739d8d2543f01bebf64346297b94a72f
