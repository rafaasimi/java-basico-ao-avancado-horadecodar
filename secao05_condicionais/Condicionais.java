package secao05_condicionais;

public class Condicionais {

    public static void main(String[] args) {

        // 1. O que é boolean?
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        // 2. Operadores de Comparação
        int x = 10;

        System.out.println(x == 10);
        System.out.println(x == 9);
        System.out.println(x != 5);
        System.out.println(x != 10);
        System.out.println(x > 10);
        System.out.println(x >= 10);
        System.out.println(x < 10);
        System.out.println(x <= 10);

        // 3. Comparação de Strings
        String string1 = "Java";
        String string2 = new String("Java");

        System.out.println(string1);
        System.out.println(string2);

        System.out.println(string1 == string2);
        System.out.println(string1 == "Java");

        System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string2));

        // 5. If
        int numero = 10;

        // Baseado em uma comparação, executamos algo
        if (numero > 5) {
            System.out.println("Sim, o número é maior que 5");
        } else {
            System.out.println("Não, o número não é maior que 5");
        }

        // If com strings
        String texto = "Teste";

        if (texto.equals("Teste")) {
            System.out.println("É igual");
        } else {
            System.out.println("Não é igual");
        }

        // 6. Else
        int q = 7;

        if (q > 10) {
            System.out.println("Q é maior que 10");
        } else {
            System.out.println("Q é menor que 10");
        }

        // 7. Else if
        double nota = 8.5;

        if (nota == 10) {
            System.out.println("Você tirou a nota máxima!");
        } else if (nota >= 9) {
            System.out.println("Nota muito boa!");
        } else if (nota >= 7) {
            System.out.println("Acima da média.");
        } else {
            System.out.println("Abaixo da média.");
        }

    }

}
