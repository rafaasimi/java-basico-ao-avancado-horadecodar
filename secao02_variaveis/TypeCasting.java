package secao02_variaveis;

public class TypeCasting {

    public static void main(String[] args) {

        // 11 - Type Casting
        // Implicito (Widening)
        int numero = 42;
        long numeroLong = numero;
        double numeroDouble = numero;

        System.out.println(numeroLong);
        System.out.println(numeroDouble);

        // Explicito (Narrowing)
        double valorDouble = 9.70;
        int valorInt = (int) valorDouble;

        System.out.println(valorDouble);
        System.out.println(valorInt);

        // Casting de char para int
        char letra = 'A';
        int codigoAscii = (int) letra;

        System.out.println(letra);
        System.out.println(codigoAscii);

    }

}
