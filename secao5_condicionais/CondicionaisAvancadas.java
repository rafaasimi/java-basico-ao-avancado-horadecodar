package secao5_condicionais;

public class CondicionaisAvancadas {

    public static void main(String[] args) {

        // 1. Condicional ternária
        int numero = 10;

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println(resultado);

        // 2. If
        int idade = 28;
        boolean temCarteira = true;

        if (idade >= 18) {

            if (temCarteira) {
                System.out.println("Pode dirigir!");
            } else {
                System.out.println("Precisa ter habilitação.");
            }

        } else {
            System.out.println("Você não pode dirigir ainda.");
        }

    }

}
