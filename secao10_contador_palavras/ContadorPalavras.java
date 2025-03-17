package secao10_contador_palavras;

import java.util.Scanner;

public class ContadorPalavras {

    /**
     * 
     * Objetivo - Criar um projeto que conta as palavras de uma frase
     * 
     * 1 - Obter uma frase do usuário
     * 2 - Contar as palavras da frase e exibir o resultado
     * 3 - Solicitar se o usuário quer digitar outra frase
     * 4 - Se sim, repetir lógica 1 e 2
     * 5 - Se não, encerrar programa
     * 
     */

    public static void main(String[] args) {

        System.out.println("Contador de Palavras");
        contarPalavras();

    }

    public static void contarPalavras() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] resultado = frase.trim().split(" ");
        System.out.println("A frase digitada possuí: " + resultado.length + " palavras.");

        System.out.println("Você gostaria de digitar outra frase? (S/N)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            contarPalavras();
        } else if (resposta.equalsIgnoreCase("N")) {
            System.exit(0);
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
        }

        scanner.close();
    }

}
