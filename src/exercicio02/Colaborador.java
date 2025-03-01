package exercicio02;

import java.util.Scanner;

public sealed abstract class Colaborador permits Gerente, Vendedor, Atendente {
  protected String nome, email, senha;
  protected boolean admin, login = false;
  
  Colaborador(String nome, String email, String senha) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
  }
  
  public String getNome() {
    if(this.login)
      return nome;
    return "";
  }
  private void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    if(this.login)
      return email;
    return "";
  }
  private void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    if(this.login)
      return senha;
    return "";
  }
  private void setSenha(String senha) {
    this.senha = senha;
  }

  public void realizarLogin() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu email: ");
    String email = sc.next();
    System.out.print("Digite sua senha: ");
    String senha = sc.next();
    if (this.email.equals(email) && this.senha.equals(senha)) {
      System.out.println("Login efetuado!");
      this.login = true;
    }
    else
      System.out.println("Email ou Senha Incorretos!");
    sc.close();
  }

  public void realizarLogoff() {
    System.out.print("Logoff efetuado!");
    this.login = false;
  }

  public void alterarDados() {
    if(this.login) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite 1 para alterar o nome e 2 para alterar o email: ");
      int opcao = sc.nextInt();
      System.out.print("Digite o novo dado: ");
      String dado = sc.next();
      if (opcao == 1) setNome(dado);
      else setEmail(dado);
      sc.close();
    }
  }

  public void alterarSenha() {
    if(this.login) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite a nova senha: ");
      String senha = sc.next();
      setSenha(senha);
      sc.close();
    }
  }

  
}
