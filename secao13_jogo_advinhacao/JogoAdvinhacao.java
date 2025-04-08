package secao13_jogo_advinhacao;

import java.util.Scanner;

/**
 * 
 * Objetivo: O usuário precisa acertar um número aleatorio entre 1 e 100
 * 
 * 1 - Criar um número aleatorio (1 e 100)
 * 2 - Pedir o palpite do usuário
 * 3 - Salvar as tentativas que foram erradas (contagem) - while até acertar
 * 4 - Enquanto o usuário não acerta, exibir se o numero alvo é maior ou menor
 * que o palpite
 * 5 - Exibir mensagem de sucesso se ele acertar, com contagem de tentativas
 * 
 */

public class JogoAdvinhacao {

  public static void main(String[] args) {

    int tentativas = 0;
    int numeroAleatorio = (int) (Math.random() * 100) + 1;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Tente adivinhar o número entre 1 e 100: ");

    int palpite = scanner.nextInt();

    while (palpite != numeroAleatorio) {

      if (palpite > numeroAleatorio) {
        System.out.println("O número alvo é menor");
      }

      if (palpite < numeroAleatorio) {
        System.out.println("O número alvo é maior");
      }

      System.out.println("Vamos tentar novamente. Tente adivinhar o número entre 1 e 100: ");
      palpite = scanner.nextInt();
      tentativas++;
    }

    System.out.println("Parabéns, você acertou! O número era: " + numeroAleatorio + " e voce fez em " + tentativas + " tentativas.");

    scanner.close();
  }

}
