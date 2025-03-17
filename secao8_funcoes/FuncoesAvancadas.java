package secao8_funcoes;

public class FuncoesAvancadas {

    public static void main(String[] args) {

        // 12. Função recursiva
        System.out.println(somaRecursiva(5));

    }

    public static int somaRecursiva(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero + somaRecursiva(numero - 1);
        }
    }

}
