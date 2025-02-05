package secao5_condicionais;

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
    }

}
