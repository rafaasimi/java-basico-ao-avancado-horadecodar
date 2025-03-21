package secao02_variaveis;

import java.util.Scanner;

// Projeto Tabuada
// Receber um número pelo scanner e exibir a tabuada do mesmo.
public class ProjetoTabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a tabuada você quer saber? ");
        int numero = scanner.nextInt();

        System.out.println(numero + "x1=" + (numero * 1));
        System.out.println(numero + "x2=" + (numero * 2));
        System.out.println(numero + "x3=" + (numero * 3));
        System.out.println(numero + "x4=" + (numero * 4));
        System.out.println(numero + "x5=" + (numero * 5));
        System.out.println(numero + "x6=" + (numero * 6));
        System.out.println(numero + "x7=" + (numero * 7));
        System.out.println(numero + "x8=" + (numero * 8));
        System.out.println(numero + "x9=" + (numero * 9));
        System.out.println(numero + "x10=" + (numero * 10));

        scanner.close();
    }

}
