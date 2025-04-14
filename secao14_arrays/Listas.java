package secao14_arrays;

public class Listas {
  
  public static void main(String[] args) {
    
    // 1. Sintaxe
    // {elemento1, elemento2, ..., elementoN}
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

    System.out.println("Acessando o primeiro elemento: " + numeros[0]);
    System.out.println("Acessando o último elemento: " + numeros[numeros.length - 1]);

    // Tamanho fixo, só que vazio
    String[] frutas = new String[3];

    // Posições: 0, 1, 2
    // Posição 3 ou mais não existe
    frutas[0] = "Banana";
    frutas[1] = "Abacaxi";
    frutas[2] = "Laranja";

    System.out.println(frutas[0]);
    System.out.println(frutas[1]);
    System.out.println(frutas[2]);
  }

}
