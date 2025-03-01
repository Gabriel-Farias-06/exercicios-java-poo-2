package exercicio01;

public final class IngressoFamilia extends Ingresso {
  private int quantidadePessoas;

  IngressoFamilia (double valor, String nomeFilme, boolean dublado, int quantidadePessoas) {
    super(valor, nomeFilme, dublado);
    this.quantidadePessoas = quantidadePessoas;
  }
  @Override
  public double valorReal() {
    return (this.quantidadePessoas > 3) ? (this.valor * this.quantidadePessoas + (this.valor * this.quantidadePessoas *  0.05)) : (this.valor * this.quantidadePessoas);
  }
  
}
