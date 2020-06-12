package unicesumarSegundoBimestre.Associação101Bi;

public class AppCarroMotor {
  public static void main(String[] args) {
    Carro uno = new Carro("Uno Mile", "fiat");
    Carro gol = new Carro("Gol", "volkswagen");
    Carro carroSemMotor = new Carro("306", "peugeot");


    Motor motorUno = new Motor("113355", 500, uno);
    Motor motorgol = new Motor("551133", 100, gol);

    uno.getMotor();
    gol.getMotor();

    motorUno.getCarro();
    motorgol.getCarro();

  }
}
