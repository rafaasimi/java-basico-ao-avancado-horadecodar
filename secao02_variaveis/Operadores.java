package secao02_variaveis;

public class Operadores {

    public static void main(String[] args) {

        // 9. Operadores Aritimeticos - Parte 1
        // Soma
        int soma = 12 + 5;
        System.out.println(soma);

        // Subtração
        System.out.println(10 - 5);

        // Multiplicação
        System.out.println(10 * 5);

        // Divisão
        // Para mostrar os decimais, pelo menos um número
        // precisa ser double.
        System.out.println(10 / 5);
        System.out.println(10 / 2.5);
        System.out.println(10.0 / 3);

        // Nesse caso, o resultado será 3, pois o Java
        // não considera os decimais.
        System.out.println(10 / 3);

        // Módulo
        // É o resto da divisão
        System.out.println(10 % 3);

        // 10. Operadores Aritimeticos - Parte 2
        // Incremento
        int x = 5;
        x++;
        System.out.println(x);

        // Decremento
        int y = 5;
        y--;
        System.out.println(y);

        // Atribuição aditiva
        int a = 10;
        a += 5;
        System.out.println(a);

        // Atribuição subtrativa
        int b = 10;
        b -= 5;
        System.out.println(b);

    }

}
