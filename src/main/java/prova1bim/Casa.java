package prova1bim;

public class Casa {
  private String rua = "Rua A";
  private int numero;
  private int qtdjanela;
  private double tamanhototalJanela;;

  public Casa(int numero, int qtdcomodo, int qtdjanela){
    this.numero= numero;
    this.qtdjanela=qtdjanela;
    this.tamanhototalJanela=CalcularTamanhoTotalJanelas(this.qtdjanela);
   }

  public double CalcularTamanhoTotalJanelas(int qtdjanela) {
    double tamanhoJanela = 10;
    return tamanhoJanela*this.qtdjanela;
  }
}
