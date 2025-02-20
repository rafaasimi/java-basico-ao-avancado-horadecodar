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

        // 3. Precedência de Operadores Lógicos
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // TRUE AND FALSE -> FALSE OR TRUE -> TRUE
        boolean resultado2 = a && b || c;
        System.out.println(resultado2);

        // TRUE OR FALSE -> TRUE AND TRUE -> TRUE
        boolean resultado3 = a || b && c;
        System.out.println(resultado3);

        // NOT(TRUE OR FALSE) -> FALSE AND TRUE -> FALSE
        boolean resultado4 = !(a || b) && c;
        System.out.println(resultado4);

        // FALSE OR FALSE -> FALSE AND TRUE -> FALSE
        boolean resultado5 = (!a || b) && c;
        System.out.println(resultado5);

    }

}
