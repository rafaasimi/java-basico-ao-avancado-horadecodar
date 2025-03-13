package secao8_funcoes;

public class Exercicios {

    public static void main(String[] args) {

        // 1
        double tempCelcius = 32;
        double tempFahrenheit = celciusParaFahrenheit(tempCelcius);
        System.out.printf("A temperatura de %.2fºC (Celcius) é de %.2fF (Fahrenheit)", tempCelcius, tempFahrenheit);

        System.out.println();

        // 2
        System.out.println(calcFatorial(5));

        // 3
        System.out.println(verificarParidade(10));

        // 4
        System.out.println(classificarNota(5));

        // 5
        verificarIdade(18);

        // 6
        System.out.println(maiorNumero(new int[] { 8, 18, 9, 3, 15, 11, 21, 30 }));
    }

    /*
     * Exercício 1: Função para Converter Temperatura
     * 
     * Crie uma função que converta uma temperatura de Celsius para Fahrenheit.
     * A função deve receber a temperatura em Celsius como argumento
     * e retornar o valor correspondente em Fahrenheit.
     * Exiba o resultado encapsulado em uma variável.
     */

    public static double celciusParaFahrenheit(double tempCelcius) {
        return (tempCelcius * 1.8) + 32;
    }

    /*
     * Exercício 2: Função para Calcular o Fatorial de um Número
     * 
     * Crie uma função que calcule o fatorial de um número inteiro.
     * Teste a função com um número de sua escolha.
     */

    public static int calcFatorial(int numero) {

        if (numero == 0 || numero == 1) {
            return 1;
        }

        return numero * calcFatorial(numero - 1);
    }

    /*
     * Exercício 3: Função com if-else para Verificar Paridade
     * 
     * Crie uma função que receba um número inteiro
     * e retorne uma string indicando se o número é "Par" ou "Ímpar".
     * Use condicionais if-else para determinar a paridade.
     */

    public static String verificarParidade(int numero) {

        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }

    }

    /*
     * Exercício 4: Função com switch para Classificar Notas
     * 
     * Crie uma função que receba uma nota de 0 a 10
     * 
     * 10 e 9: A, 8: B, 7: C, 6: D, restante F
     * 
     * e retorne uma classificação de letra (A, B, C, D, F) usando um switch.
     * Inclua uma verificação para garantir que a nota está dentro do intervalo
     * válido.
     */

    public static String classificarNota(int nota) {

        if (nota < 0 || nota > 10) {
            return "Nota inválida.";
        }

        switch (nota) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }

    }

    /*
     * Exercício 5: Função com System.exit para Verificar Idade
     * 
     * Crie uma função que receba a idade de uma pessoa.
     * Se a idade for menor que 18, use System.exit(0)
     * para encerrar o programa com uma mensagem de "Acesso negado".
     * Caso contrário, exiba "Acesso permitido".
     */

    public static void verificarIdade(int idade) {

        if (idade < 18) {
            System.out.println("Acesso negado.");
            System.exit(0);
        }

        System.out.println("Acesso permitido.");
    }

    /*
     * Exercício 6 (Desafio): Função que Recebe um Array e Retorna o Maior Número
     * 
     * Crie uma função que receba um array de inteiros
     * e retorne o maior número presente no array.
     * Utilize um loop para percorrer os elementos do array e identificar o maior
     * valor.
     */

    public static int maiorNumero(int[] numeros) {
        int maiorNumero = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            maiorNumero = Math.max(maiorNumero, numeros[i]);
        }

        return maiorNumero;
    }

}
