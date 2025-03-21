package secao02_variaveis;

public class Exercicios {

    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
    }

    /*
    EXERCÍCIO 1:

    Crie uma variável int para armazenar o valor 10. 
    Crie uma segunda variável int que armazene o dobro do valor da primeira variável
    usando operadores aritméticos. 
    Exiba o resultado.
     */
    public static void exercicio1() {
        int valor = 10;
        int dobroValor = valor * 2;
        System.out.println(dobroValor);
    }

    /*
    EXERCÍCIO 2:

    Declare uma variável char que armazene a letra 'B'. 
    Faça o casting explícito dessa variável para int e exiba o valor numérico correspondente.
     */
    public static void exercicio2() {
        char letra = 'B';
        int codigoAscii = (int) letra;
        System.out.println(codigoAscii);
    }

    /*
    EXERCÍCIO 3:

    Declare duas variáveis double para armazenar os valores 15.75 e 20.40. 
    Some os valores dessas variáveis e armazene o resultado em uma nova variável double. 
    Exiba o resultado.
     */
    public static void exercicio3() {
        double valor1 = 15.75;
        double valor2 = 20.40;
        double soma = valor1 + valor2;
        System.out.println(soma);
    }

    /*
    EXERCÍCIO 4:

    Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000). 
    Em seguida, declare uma variável int e faça o casting explícito do valor long para int. 
    Exiba o resultado.
     */
    public static void exercicio4() {
        long valorLong = 2_000_000_000L;
        int valorInt = (int) valorLong;
        System.out.println(valorInt);
    }

    /*
    EXERCÍCIO 5:

    Escreva um programa que crie uma variável String com o valor "Olá, Mundo!". 
    Em seguida, crie outra variável String que concatene a primeira variável com o texto 
    " Bem-vindo ao Java!". 
    Exiba o resultado.
     */
    public static void exercicio5() {
        String texto1 = "Olá, Mundo!";
        String texto2 = texto1 + " Bem-vindo ao Java!";
        System.out.println(texto2);
    }
}
