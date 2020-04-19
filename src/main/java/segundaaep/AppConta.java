package segundaaep;

public class AppConta {

  public static void main(String[] username, int Senha) {
    Conta contaErrada = new Conta("leo",123);
    Conta contaQuase = new Conta("EtBilu",222);
    Conta contaCerta = new Conta("Leonardo",333);

    contaErrada.login("leo", 123);

    contaQuase.ativarConta();
    contaQuase.login("EtBilu", 221);

    contaCerta.ativarConta();
    contaCerta.login("Leonardo", 333);

	}
}
