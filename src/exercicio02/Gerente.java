package exercicio02;

public final class Gerente extends Colaborador {
  Gerente(String nome, String email, String senha) {
    super(nome, email, senha);
    this.admin = true;
  }

  void gerarRelatorio(Atendente ate) {
    if (this.login) {
      System.out.println("Relatório do atendente " + ate.nome + " : R$ " + ate.getValorCaixa(this));
    }
  }

  void consultarVendas(Vendedor ven) {
    if (this.login)
      System.out.println("A quantidade de vendas efetuadas do vendedor " + ven.nome + " foi de: " + ven.getQuantidadeVendas(this));
  }
}
