public class Carro{
  private String modelo;
  private String marca;
}

class Main {
  public static void main() {
      Carro carro1; // <- referência não inicializada
      carro1 = new Carro(); // <- referência inicializada

      Carro carro2;
      carro2 = carro1; // < Segunda referencia da instancia
  }
}

