package unicesumarSegundoBimestre.Associação0n0nBi;

import java.util.ArrayList;

public class Empregado {
  private String nome;
  private PosiçãoEnum nivel;
  private ArrayList<Projeto> projetos = new ArrayList<>();

  public Empregado(String nome, PosiçãoEnum nivel){
    this.nome = nome;
    this.nivel = nivel;
  }

  public String getNome(){
    return this.nome;
  }

  public PosiçãoEnum getNivel(){
    return this.nivel;
  }

  public ArrayList<Projeto> getProjetos() {
		return this.projetos;
  }

  public void addProjeto(Projeto projeto){
    this.projetos.add(projeto);
    projeto.addEmpregado(this);
  }
}
