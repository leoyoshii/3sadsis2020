package unicesumarSegundoBimestre.Associação101Bi;

public class Carro {
    private String modelo;
    private String marca;
    private Motor motor;

    public Carro (String modelo, String marca) {
      this.modelo = modelo;
      this.marca = marca;

    }

    public String getMarca(){
      return this.marca;
    }

    public String getModelo(){
      return this.modelo;
    }

    public Motor getMotor(){
      return this.motor;
    }

    public void setMotor(Motor motor){
      this.motor = motor;
    }
  }

