package secao12_calculadora_simples;

import java.util.Scanner;

/**
 * 
 * Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e
 * subtração
 * 
 * 1 - Pedir dois números para o usuário (double)
 * 2 - Apresentar uma tabela/texto para escolher a operação
 * 3 - Resgatar a operação que o usuário seleciou
 * 4 - Realizar o calculo
 * 5 - Exibir o resultado
 * 6 - Se a operação escolhida for inválida, exibir mensagem de erro
 * 7 - Se a divisão for por 0, exibir mensagem de erro
 * 
 */

public class CalculadoraSimples {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String opcao = "";

    do {

      System.out.println("");
      System.out.println("Calculadora Simples");
      System.out.println("");
      System.out.println("1) - Soma");
      System.out.println("2) - Subtração");
      System.out.println("3) - Multiplicação");
      System.out.println("4) - Divisão");
      System.out.println("5) - Sair");
      System.out.println("");
      System.out.println("Deseja fazer qual operação?");

      opcao = scanner.nextLine();

      double n1 = 0;
      double n2 = 0;

      switch (opcao) {
        case "1":
          System.out.println("Digite o primeiro número:");
          n1 = scanner.nextDouble();

          System.out.println("Digite o segundo número:");
          n2 = scanner.nextDouble();
          Soma(n1, n2);
          break;
        case "2":
          System.out.println("Digite o primeiro número:");
          n1 = scanner.nextDouble();

          System.out.println("Digite o segundo número:");
          n2 = scanner.nextDouble();
          Substracao(n1, n2);
          break;
        case "3":
          System.out.println("Digite o primeiro número:");
          n1 = scanner.nextDouble();

          System.out.println("Digite o segundo número:");
          n2 = scanner.nextDouble();
          Multiplicacao(n1, n2);
          break;
        case "4":
          System.out.println("Digite o primeiro número:");
          n1 = scanner.nextDouble();

          System.out.println("Digite o segundo número:");
          n2 = scanner.nextDouble();
          Divisao(n1, n2);
          break;
        case "5":
          System.out.println("Saindo da calculadora...");
          break;
        default:
          System.out.println("Opção inválida, tente novamente.");
          break;
      }

    } while (!opcao.equals("5"));

    scanner.close();

  }

  public static void Soma(double n1, double n2) {
    System.out.printf("A soma de %f + %f é de: %f", n1, n2, n1 + n2);
  }

  public static void Substracao(double n1, double n2) {
    System.out.printf("A subtração de %f - %f é de: %f", n1, n2, n1 - n2);
  }

  public static void Multiplicacao(double n1, double n2) {
    System.out.printf("A multiplicação de %f * %f é de: %f", n1, n2, n1 * n2);
  }

  public static void Divisao(double n1, double n2) {

    if (n1 == 0 || n2 == 0) {
      System.out.println("Erro: Divisão por 0");
      System.exit(0);
    }

    System.out.printf("A divisão de %f / %f é de: %f", n1, n2, n1 / n2);

  }

}
