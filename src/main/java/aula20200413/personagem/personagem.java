package aula20200413.personagem;

public class Personagem {
  private String nome;
  private int level=1;
  private double xp=0;
  private double vida=100;
  private double ataque=10;
  private double defesa=10;
  private double inteligencia=10;
  private Classe classe;

  // 2.1 Um construtor padrão;
  public Personagem(){
    this.nome = null;
    setStatus(Classe.GUERREIRO);
  }
  // 2.2 Um construtor alternativo;
  public Personagem(String nome, Classe classe){
    this.setStatus(classe);
    this.nome=nome;
  }

  // 2.3 Método modificador;
  private void setStatus(Classe classe){
    if (classe == Classe.GUERREIRO){
      this.defesa += 5;
      this.ataque += 5;
    }else if (classe ==  Classe.MAGO){
      this.defesa += 5;
      this.inteligencia +=5;
    }else if(classe ==  Classe.ARQUEIRO){
      this.ataque +=5;
      this.inteligencia+=5;
    }
  }
  // 2.3 Um método modificador;
  public void levelUp(){
    this.level += 1;
    this.xp = 0;
    this.vida = 10;
    this.ataque += 2;
    this.defesa += 2;
    this.inteligencia += 2;
  }

  public void verificarLevel(){
    if(this.xp == 100){
      this.levelUp();
    }
  }
  // 2.4 Um método de acesso cujo retorno seja o valor de um atributo;
  public boolean isVivo(){
    if(getVida() > 0 ){
      return true;
    }else{
      return false;
    }
  }
  // 2.4 Um método de acesso cujo retorno seja o valor de um atributo;
  public double getVida(){
    return this.vida;
  }

  // 2.3 Um método modificador;
  public double dormir(){
    this.vida = 100;
  }

  // 2.6 Um método encapsulado que seja usado pelo método de acesso do item 2.5.
  private double metodoLoucoParaCalcularBatalhas(){
    this.vida += (this.defesa/this.inteligencia - this.ataque)*2;
    this.xp += 20;
    this.verificarLevel();
    return this.vida;
  }

  // 2.5 Um método de acesso cujo retorno NÂO seja o valor de um atributo, mas sim
	// um valor CALCULADO em função de um valor de atributo.;
  public void atacarMonstro(){
    if(this.isVivo()){
      this.vida = this.metodoLoucoParaCalcularBatalhas();
    }
  }
}
