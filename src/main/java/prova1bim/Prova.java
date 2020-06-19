package prova1bim;

public class Prova {
  private String nomeDisciplina;
  private double valorProva;

  public Prova(String nomeDisciplina, double valorProva){
    this.nomeDisciplina = validarNomeDiscilpina(nomeDisciplina);
    this.valorProva =  validarNotaProva(valorProva);
   }

  private String validarNomeDiscilpina(String nomeDisciplina) {
    if (nomeDisciplina.trim().length() == 0 || nomeDisciplina == null){
      throw new RuntimeException("Esse nome não é válido!");
    }else{
      return nomeDisciplina;
    }
  }

  private double validarNotaProva(double valorProva){
    if(valorProva > 10 || valorProva < 0){
      throw new RuntimeException("Valor da prova deve ser entre 0.0 e 10.0");
    }else{
      return valorProva;
    }
  }
}
