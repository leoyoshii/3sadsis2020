package unicesumarSegundoBimestre.Associação0n0nBi;

import java.util.ArrayList;

public class Projeto {
  private String nome;
  private ArrayList<Empregado> empregados = new ArrayList<>();

  public Projeto(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public ArrayList<Empregado> getEmpregados(){
		return empregados;
  }

  public void addEmpregado(Empregado empregado){
    this.empregados.add(empregado);
    empregado.addProjeto(this);
  }
}
