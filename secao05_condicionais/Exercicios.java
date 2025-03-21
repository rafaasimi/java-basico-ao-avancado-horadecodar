package secao05_condicionais;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        // exercicio1();
        // exercicio2();
        // exercicio3();
        // exercicio4();
        // exercicio5();
        exercicio6();

    }

    /*
  Exercício 1: Verificação de Categoria de Preço

  Peça ao usuário para inserir o preço de um produto. 
  Se o preço for menor que 50, categorize-o como "Barato". 
  Se estiver entre 50 e 100, categorize como "Médio". 
  Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente. 
     */
    public static void exercicio1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de um produto: ");
        double valor = scanner.nextDouble();

        if (valor < 50) {
            System.out.println("Barato");
        } else if (valor >= 50 && valor <= 100) {
            System.out.println("Médio");
        } else {
            System.out.println("Caro");
        }

        scanner.close();
    }

    /*
    Exercício 2: Validação de Login

    Peça ao usuário para inserir um nome de usuário e uma senha. 
    Verifique se o nome de usuário é "admin" e a senha é "1234". 
    Se ambos forem corretos, exiba "Acesso permitido". 
    Caso contrário, exiba "Acesso negado".
     */
    public static void exercicio2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário: ");
        String usuario = scanner.nextLine();

        System.out.println("Digite a sua senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        scanner.close();
    }

    /*
     Exercício 3: Identificação de Paridade com Strings

    Peça ao usuário para inserir um número. 
    Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Ímpar". 
    Use uma string para armazenar o resultado e exibi-la.

    Depois de avaliar o número, tu vai colocar se é par ou impar em uma var.
     */
    public static void exercicio3() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número qualquer inteiro: ");
        int numero = scanner.nextInt();

        String resultado;
        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        System.out.println("O número digitado é: " + resultado);

        scanner.close();

    }

    /*
     Exercício 4: Identificação de Dia Útil

    Peça ao usuário para inserir um número de 1 a 7, 
    representando os dias da semana (1 para domingo, 2 para segunda, etc.). 
    Use switch para verificar se o dia é um dia útil (segunda a sexta) 
    ou final de semana (sábado e domingo). 
    Exiba uma mensagem correspondente.
     */
    public static void exercicio4() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");
        int diaDaSemana = scanner.nextInt();

        switch (diaDaSemana) {
            case 1, 7 ->
                System.out.println("Final de semana");
            case 2, 3, 4, 5, 6 ->
                System.out.println("Dia de semana");
            default ->
                System.out.println("Número inválido.");
        }

        // switch (diaDaSemana) {
        //     case 1:
        //     case 7:
        //         System.out.println("Final de semana");
        //         break;
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //     case 6:
        //         System.out.println("Dia de semana");
        //         break;
        //     default:
        //         System.out.println("Número inválido.");
        //         break;
        // }
        scanner.close();

    }

    /*
     Exercício 5: Verificação de Intervalo com AND

    Peça ao usuário para inserir um número. 
    Verifique se o número está no intervalo de 10 a 20, inclusive. 
    Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".
     */
    public static void exercicio5() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println("Dentro do intervalo");
        } else {
            System.out.println("Fora do intervalo");
        }

        scanner.close();

    }

    /*
     Exercício 6: Classificação de Letra

    Peça ao usuário para inserir uma letra. 
    Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante. 
    Exiba "Vogal" ou "Consoante" de acordo com a entrada. 
    Considere tanto letras maiúsculas quanto minúsculas. 
     */
    public static void exercicio6() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);

        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u' ->
                System.out.println("É uma vogal.");
            default ->
                System.out.println("É uma consoante.");
        }

        scanner.close();

    }
}
