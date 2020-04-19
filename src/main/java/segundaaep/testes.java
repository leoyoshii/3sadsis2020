package segundaaep;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteComConta {

	@Test
	void TestarNaoAtivo() {
    Conta contaErrada = new Conta("leo",123);

		assertFalse(contaErrada.login("leo",123));
	}

	@Test
	void TestarSenhaErrada() {
		Conta contaQuase = new Conta("EtBilu",222);

    contaQuase.ativarConta();
		assertFalse(contaQuase.login("EtBilu",22));
	}


	@Test
	void TestarCerto() {
    Conta contaCerta = new Conta("Leonardo",333);
    contaCerta.ativarConta();
    assertTrue(contaCerta.login("Leonardo", 333));
  }
}


















