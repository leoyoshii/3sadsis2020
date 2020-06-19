package unicesumarSegundoBimestre.Associação0n0nBi;

public class AppEmpProjeto {
  public static void main(String[] args) {
    Empregado leo = new Empregado("leo", PosiçãoEnum.JUNIOR);
    Empregado leonardo = new Empregado("leonardo", PosiçãoEnum.PLENO);
    Empregado lYoshii = new Empregado("Leonardo Yoshii", PosiçãoEnum.SENIOR);

    Projeto starLink = new Projeto("starLink");
    Projeto covid = new Projeto("Cura do Covid");
    Projeto buracoNegro = new Projeto("busca de Buracos Negros");

    leo.addProjeto(starLink);
    leonardo.addProjeto(covid);
    lYoshii.addProjeto(buracoNegro);

    starLink.addEmpregado(leonardo);
    covid.addEmpregado(lYoshii);
    buracoNegro.addEmpregado(leo);
    buracoNegro.addEmpregado(leonardo);

    covid.getEmpregados();
    starLink.getEmpregados();
    buracoNegro.getEmpregados();

    leo.getProjetos();
    leonardo.getProjetos();
    lYoshii.getProjetos();
  }
}
