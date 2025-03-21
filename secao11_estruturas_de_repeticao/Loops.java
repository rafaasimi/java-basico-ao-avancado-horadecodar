package secao11_estruturas_de_repeticao;

public class Loops {

  public static void main(String[] args) {

    // 1. For
    // Loop que irá rodar de 1 a 5
    // Variavel de inicialização: int i = 0, int j = 1
    // Condição: determina até quando ou quantas vezes o loop irá executar
    // Incremento ou Decremento: Forma de fazer a váriavel chegar a condição
    for (int i = 1; i <= 5; i++) {
      System.out.println("Contador: " + i);
    }

    // Mostrar cada caractere da String
    String palavra = "Rafael";

    // Arrays e Strings a primeira posição é 0
    for (int i = 0; i < palavra.length(); i++) {
      System.out.println("Caractere: " + palavra.charAt(i));
    }

    // Contagem regressiva
    for (int i = 10; i >= 0; i--) {
      System.out.println("Contagem regressiva: " + i);
    }

    // 2. While
    // Loop que irá rodar de 1 a 5
    int contador = 1;
    while (contador <= 5) {
      System.out.println("While Contador: " + contador);

      contador++;
    }

    // Não sabemos a quantidade de execuções
    // Enquanto o valor for diferente de 7, execute
    int valor = 0;
    while (valor != 7) {
      valor = (int) (Math.random() * 10);
      System.out.println("Valor aleatório: " + valor);
    }

    // 3. Loop infinito
    // while (true) {
    // System.out.println("Infinito!");
    // }

    for (int j = 0; j <= 5; j--) {
      System.out.println("Contagem: " + j);
    }
  }

}
