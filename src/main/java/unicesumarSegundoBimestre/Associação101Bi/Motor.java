package unicesumarSegundoBimestre.Associação101Bi;

public class Motor {
  private String numeroMotor;
  private Integer potencia;
  private Carro carro;


  public Motor(String numeroMotor,Integer potencia, Carro carro){
    this.numeroMotor = numeroMotor;
    this.potencia = potencia;
    this.carro = carro;
    this.carro.setMotor(this);
  }

  public String getNumeroMotor(){
    return this.numeroMotor;
  }

  public Integer getPotencia(){
    return this.potencia;
  }

  public Carro getCarro(){
    return this.carro;
  }




}
