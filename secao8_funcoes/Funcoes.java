package secao8_funcoes;

public class Funcoes {

    public static void main(String[] args) {
        saudacao();
    }

    // 1. Criando a primeira função
    // public -> nivel de acesso
    // static -> não precisa instanciar a classe para executar
    // void -> a função não irá ter retorno
    public static void saudacao() {
        System.out.println("Olá, está é a minha primeira função.");
    }

}
