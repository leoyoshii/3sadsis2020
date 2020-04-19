package segundaaep;

public class Conta {
  private String username;
  private int senha;
  private boolean active;


  public Conta(String username, int senha){
   this.username= username;
   this.senha=senha;
   this.active=false;
  }

  private boolean getActive(){
    return this.active;
  }


  private void verificarAtivo(){
    boolean ativo = this.getActive();
    if(!ativo){
      throw new RuntimeException("Sua conta não está ativada");
    }
  }

  private void verificarSenha(int senha) throws Exception{
    if(this.senha != senha){
      throw new Exception("Senha incorreta");
    }
  }

  public boolean login(String username, int senha){
    String mensagem= "";

    try {
      this.verificarAtivo();
      this.verificarSenha(senha);
      mensagem = "Voce está Logado";
      return true;
    } catch (Exception e) {
     System.out.println("Mensagem de exceção:" + e.getMessage());
     mensagem = "Não conseguiu logar";
     return false;
    }finally{
      System.out.println(mensagem);
    }
  }


  public void ativarConta(){
    this.active = true;
  }

}
