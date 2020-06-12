package unicesumarSegundoBimestre.Associação11nUni;

public class AppMarcaModelo {
  public static void main(String[] args) {
    Marca ford = new Marca("ford");
    Marca fiat = new Marca("fiat");

    Modelo ka = new Modelo(ford,"Ka", 2020);
    Modelo focus = new Modelo(ford,"Focus", 2020);
    Modelo uno = new Modelo(fiat,"Uno Mille", 1995);

    ford.getModelos();
    fiat.getModelos();

  }
}
