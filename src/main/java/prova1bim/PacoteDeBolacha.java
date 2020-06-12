package prova1bim;

public class PacoteDeBolacha {
  private String marca;
  private String sabor;
  private boolean aberta;

  public PacoteDeBolacha(String marca, String sabor){
    this.marca=marca;
    this.sabor=marca;
    this.aberta=false;
   }

  private boolean isAberta(){
   return this.aberta;
  }

  public void AbrirEDescobrirOutroSabor(String sabor,boolean aberta ){
    this.sabor = sabor;
    if(!isAberta()){
      this.aberta = aberta;
    }
  }

  public boolean TrocarAberta(){
    this.aberta = !this.aberta;
    return this.aberta;
  }
}
