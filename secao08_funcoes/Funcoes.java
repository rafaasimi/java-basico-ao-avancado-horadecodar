package secao08_funcoes;

public class Funcoes {

    public static void main(String[] args) {
        saudar("Rafael");
        soma(2, 4);

        int numero = 32;
        int numeroDobrado = dobrar(numero);
        System.out.println("Numero dobrado: " + numeroDobrado);
        System.out.println(dobrar(14));

        String resultado1 = verificarPar(10);
        String resultado2 = verificarPar(13);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }

    // 1. Criando a primeira função
    // public -> nivel de acesso
    // static -> não precisa instanciar a classe para executar
    // void -> a função não irá ter retorno
    public static void saudar(String nome) {
        System.out.println("Olá " + nome + ", seja bem-vindo.");
    }

    // 2. Parâmetros
    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);
    }

    // 3. Return
    public static int dobrar(int n) {
        return n * 2;
    }

    // 4. Retorno em variável
    public static String verificarPar(int n) {

        if (n % 2 == 0) {
            return "O número " + n + " é par.";
        } else {
            return "O número " + n + " não é par.";

        }

    }

}
