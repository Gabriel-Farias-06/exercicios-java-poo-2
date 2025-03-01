package exercicio02;

public final class Vendedor extends Colaborador {
  private double quantidadeVendas;
  
  Vendedor (String nome, String email, String senha) {
    super(nome, email, senha);
    this.admin = false;
  }
  
  public double getQuantidadeVendas(Colaborador col) {
    if (col.login && col.admin)
      return quantidadeVendas; 
    return 0;
  }
  
  public void setQuantidadeVendas(double quantidadeVendas) {
    if (this.login)
      this.quantidadeVendas = quantidadeVendas;
  }
}
