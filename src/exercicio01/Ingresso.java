package exercicio01;

public sealed abstract class Ingresso permits MeiaEntrada, IngressoFamilia {
  protected double valor;
  protected String nomeFilme;
  //dublado false == legendado
  protected boolean dublado;

  Ingresso(double valor, String nomeFilme, boolean dublado) {
    this.valor = valor;
    this.nomeFilme = nomeFilme;
    this.dublado = dublado;
  }

  public abstract double valorReal();
}
