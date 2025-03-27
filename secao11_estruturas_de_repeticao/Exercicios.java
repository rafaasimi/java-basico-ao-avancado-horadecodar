package secao11_estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicios {

  public static void main(String[] args) {

    // exercicio1();
    // exercicio2();
    // exercicio3();
    // exercicio4();
    // exercicio5(12);
    exercicio6(564);

  }

  /*
   * > Exercício 1: Somatório com for
   * 
   * Crie um programa que use um loop for para calcular
   * o somatório dos números de 1 a 100 e exiba o resultado.
   * 1 + 2 + 3... = x
   */

  public static void exercicio1() {
    int somatorio = 0;

    for (int i = 1; i <= 100; i++) {
      somatorio += i;
    }

    System.out.println(somatorio);

  }

  /*
   * > Exercício 2: Impressão de Números Pares com while
   * 
   * Desenvolva um programa que use um loop while para imprimir
   * todos os números pares de 1 a 20.
   */

  public static void exercicio2() {
    int i = 1;

    while (i <= 20) {
      if (i % 2 == 0) {
        System.out.println("O numero " + i + " é par.");
      }
      i++;
    }
  }

  /*
   * > Exercício 3: Verificação de Número Primo com for
   * 
   * Escreva um programa que receba um número do usuário
   * e use um loop for para verificar se ele é primo.
   */

  public static void exercicio3() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número para verificar se ele é primo: ");
    int numero = scanner.nextInt();

    boolean ehPrimo = true;

    for (int i = 2; i <= numero - 1; i++) {
      if (numero % i == 0) {
        ehPrimo = false;
        break;
      }

    }

    if (ehPrimo) {
      System.out.println("O numero " + numero + " é primo.");

    } else {
      System.out.println("O numero " + numero + " NÃO é primo.");
    }

    scanner.close();
  }

  /*
   * > Exercício 4: Menu Interativo com do-while
   * 
   * Crie um programa que exiba um menu interativo usando do-while,
   * permitindo ao usuário escolher opções até que ele decida sair.
   * 
   * // menu de opcoes com print: 1) comida 2) bebida
   * // um numero aleatorio que mediante a ser X, pare o loop
   */

  public static void exercicio4() {
    int menu;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("1) Hamburguer");
      System.out.println("2) Cachorro Quente");
      System.out.println("3) Refrigerante");
      System.out.println("4) Sair");

      menu = scanner.nextInt();

      System.out.println("Você escolheu a opção: " + menu);

    } while (menu != 4);
    System.out.println("Saindo do programa.");
    scanner.close();

  }

  /*
   * > Exercício 5: Fatorial de um Número com for
   * 
   * Desenvolva um programa que calcule o
   * fatorial de um número inteiro positivo usando um loop for.
   * 
   * 5 * 4 * 3 * 2 * 1
   * 
   * 1 * 2 * 3 * 4 * 5
   */
  public static void exercicio5(int numero) {
    int resultado = 1;

    if (numero == 0 || numero == 1) {
      System.out.println(resultado);
      return;
    }

    for (int i = 1; i <= numero; i++) {
      resultado *= i;
    }

    System.out.println(resultado);

  }

  /*
   * > Exercício 6: Contagem de Dígitos de um Número com while
   * 
   * Crie um programa que conte quantos dígitos há em um número inteiro positivo
   * usando um loop while.
   * 
   * 1000 = 4 digitos
   */

  public static void exercicio6(int numero) {

    String numeroStr = String.valueOf(numero);

    int i = 0;
    int digitos = 0;
    while (i <= numeroStr.length()) {
      digitos = i;
      i++;
    }

    System.out.println(digitos);

  }

}
