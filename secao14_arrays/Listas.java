package secao14_arrays;

public class Listas {

  public static void main(String[] args) {

    // 1. Sintaxe
    // {elemento1, elemento2, ..., elementoN}
    int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8 };

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

    // 2. Loops em arrays
    int soma = 0;
    for (int i = 0; i < numeros.length; i++) {
      soma += numeros[i];
    }
    System.out.println("A soma do array de números é: " + soma);

    for (String fruta : frutas) {
      System.out.println("A fruta da vez é: " + fruta);
    }

    // Encontrar o maior valor de um array
    int[] valores = { 10, 25, 8, 22, 1 };
    int maiorValor = valores[0];

    int j = 0;
    while (j < valores.length) {
      maiorValor = Math.max(maiorValor, valores[j]);
      j++;
    }

    System.out.println("O maior valor do array é: " + maiorValor);

    // 3. For-each
    for (int numero : numeros) {
      System.out.println("O número é: " + numero);
    }

    // Concatenar elementos de um arrau
    String[] palavras = { "Java", "é", "bom!" };
    String frase = "";

    for (String palavra : palavras) {
      frase += palavra + " ";
    }

    System.out.println(frase);

    // Verificar se valor está presente no array
    char[] letras = { 'a', 'e', 'i', 'o', 'u' };
    char letraProcurada = 'i';

    for (char letra : letras) {
      if (letra == letraProcurada) {
        System.out.println("A letra " + letraProcurada + " está presente no array.");
        break;
      }
    }

    // 4. Loops com if
    // Filtrar e somar numeros pares
    int somaPares = 0;

    for (int numero : numeros) {
      if (numero % 2 == 0) {
        somaPares += numero;
      }
    }

    System.out.println("Soma dos números pares: " + somaPares);

    // Exibir valores maiores que um determinado valor
    int[] nums = { 12, 6, 18, 24, 48, 5 };
    int limite = 10;

    for (int num : nums) {
      if (num > limite) {
        System.out.println("O número " + num + " é maior que " + limite);
      }
    }

    String[] linguagens = { "Java", "C", "Python", "PHP" };
    String linguagemAlvo = "Python";

    for (String linguagem : linguagens) {
      if (linguagem.equals(linguagemAlvo)) {
        System.out.println("A linguagem " + linguagem + " foi encontrada.");
        break;
      } else {
        System.out.println("Linguagem ainda não encontrada.");
      }
    }

    // 5. Atualizar valores
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = numeros[i] * 2;
    }

    for (int numero : numeros) {
      System.out.println("Numero dobrado: " + numero);
    }

    for(int i = 0; i < frutas.length; i++) {
      if(frutas[i].equals("Banana")) {
        frutas[i] = "Abacate";
      }
    }

    System.out.println(frutas[0]);

    for(int numero : numeros) {
      numero *= 2;
    }

    for(int numero : numeros) {
      System.out.println("Numero dobrado: " + numero);
    }

  }

}
