package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("=====Bem-vindo ao cinema xxxx=====\n\n\n\nQual o tipo de ingresso que deseja comprar?\n1- Meia Entrada\n2- Ingresso Família\nDigite sua opção: ");
        Ingresso ingresso;
        int tipoIngresso = sc.nextInt();
        System.out.print("Digite o valor do ingresso: ");
        double valor = sc.nextDouble();
        System.out.print("Digite o nome do filme: ");
        String nome = sc.next();
        System.out.print("Digite 1 para filme dublado e 2 para legendado: ");
        boolean dublado = sc.nextInt() == 1 ? true: false;
        if (tipoIngresso == 2) {
            System.out.print("Digite a quantidade de pessoas: ");
            int pessoas = sc.nextInt();
            ingresso = new IngressoFamilia(valor, nome, dublado, pessoas);
        }
        else
            ingresso = new MeiaEntrada(valor, nome, dublado);
        int opcao = 0;
        do {
            System.out.print("===Selecione sua opção===\n1- Ver valor total a ser pago\n2- Sair\nDigite sua escolha: ");
            opcao = sc.nextInt();
            if (opcao == 1)
                System.out.printf("O valor total do ingresso é de: R$ %.2f\n", ingresso.valorReal());
        }   while(opcao != 2);
        sc.close();
    }
}
