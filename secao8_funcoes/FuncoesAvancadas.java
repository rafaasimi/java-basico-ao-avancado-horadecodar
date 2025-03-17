package secao8_funcoes;

public class FuncoesAvancadas {

    public static void main(String[] args) {

        // 12. Função recursiva
        System.out.println(somaRecursiva(5));

        // 13. Método de Overloading
        System.out.println(soma(1, 2));
        System.out.println(soma(10, 20, 30));
        System.out.println(soma(15.5, 18.5));
    }

    public static int somaRecursiva(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero + somaRecursiva(numero - 1);
        }
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static double soma(double a, double b) {
        return a + b;
    }

}
