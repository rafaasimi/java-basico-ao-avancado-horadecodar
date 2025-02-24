package secao8_funcoes;

public class Funcoes {

    public static void main(String[] args) {
        saudacao();
        soma(2, 4);
    }

    // 1. Criando a primeira função
    // public -> nivel de acesso
    // static -> não precisa instanciar a classe para executar
    // void -> a função não irá ter retorno
    public static void saudacao() {
        System.out.println("Olá, está é a minha primeira função.");
    }

    // 2. Parâmetros
    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);
    }

}
