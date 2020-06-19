package unicesumarSegundoBimestre.Associação11nUni;

import java.util.ArrayList;


public class Marca {
  private String nome;
  private ArrayList<Modelo> modelos = new ArrayList<>();

  public Marca(String nome) {
    this.nome=nome;
  }

  public String GetNomeMarca(){
    return this.nome;
  }

  public ArrayList<Modelo> getModelos(){
    return modelos;
  }
}
