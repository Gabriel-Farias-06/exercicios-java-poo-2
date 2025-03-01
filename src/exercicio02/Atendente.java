package exercicio02;

public final class Atendente extends Colaborador {
  private double valorCaixa;
  private boolean caixaAberto = true;
  
  Atendente (String nome, String email, String senha) {
    super(nome, email, senha);
    this.admin = false;
  }
  
  public double getValorCaixa(Gerente ger) {
    if(ger.login)
      return valorCaixa;
    return 0;
  }

  public void receberPagamento(double valorCaixa) {
    if(this.login && this.caixaAberto)
      this.valorCaixa += valorCaixa;
    else
      System.out.println("O caixa foi fechado ou seu login não foi efetuado");
  }

  public void fecharCaixa() {
    this.caixaAberto = false;
    System.out.println("O caixa foi fechado");
  }
}
