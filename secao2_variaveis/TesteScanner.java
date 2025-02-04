package secao2_variaveis;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {

        // Inicializando o Scanner
        Scanner scanner = new Scanner(System.in);

        // Captura o valor digitado pelo usuario
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Captura o valor digitado pelo usuario
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Exibe em tela o nome e idade digitada
        System.out.println("Olá " + nome + "! Você possuí " + idade + " anos.");

        // Finaliza o Scanner
        scanner.close();

    }

}
