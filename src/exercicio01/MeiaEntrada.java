package exercicio01;

public final class MeiaEntrada extends Ingresso {
  MeiaEntrada(double valor, String nomeFilme, boolean dublado) {
    super(valor, nomeFilme, dublado);
  }

  @Override
  public double valorReal() {
    return this.valor * 0.5;
  }
}
