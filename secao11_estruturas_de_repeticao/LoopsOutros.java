package secao11_estruturas_de_repeticao;

public class LoopsOutros {

  public static void main(String[] args) {

    // 8. Loops com rótullos (labels)
    // Rótulos externos e internos

    externo: for (int i = 0; i < 3; i++) {

      for (int j = 0; j < 3; j++) {

        if (i == 1 && j == 1) {
          break externo;
        }

        System.out.println("i" + i + " | j" + j);

      }

    }

    for (int i = 0; i < 3; i++) {

      interno: for (int j = 0; j < 3; j++) {

        if (j == 2) {
          System.out.println("Parou interno.");

          break interno;
        }

        System.out.println("i" + i + " | j" + j);

      }

    }

    // 9. Off By One
    int[] numeros = {1, 2, 3, 4};

    // Executar 5 vezes -> irá acessar elemento inválido
    for(int i = 0; i <= 5; i++) {
      System.out.println("i: " + numeros[i]);
    }

  }

}
