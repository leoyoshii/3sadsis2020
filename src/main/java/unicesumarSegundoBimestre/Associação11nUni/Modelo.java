package unicesumarSegundoBimestre.Associação11nUni;

public class Modelo {
  private String nome;
  private Integer ano;
  private Marca marca;

  public Modelo (Marca marca, String nome, Integer ano) {
    this.nome = nome;
    this.ano = ano;
    this.marca = marca;
    this.marca.getModelos().add(this);
  }

  public Marca getMarca(){
    return this.marca;
  }

  public String getNome(){
    return this.nome;
  }

  public Integer getAno(){
    return this.ano;
  }
}
