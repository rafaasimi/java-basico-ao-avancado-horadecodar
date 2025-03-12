package secao8_funcoes;

public class FuncoesBuildIn {

    public static void main(String[] args) {

        // 10. BuiltIn String
        String frase = "Java é muito bom!";

        // Length
        System.out.println(frase.length());

        // Substring
        System.out.println(frase.substring(0, 4));

        // Maiusculo
        System.out.println(frase.toUpperCase());

        // Minusculo
        System.out.println(frase.toLowerCase());

        // Replace
        System.out.println(frase.replace("a", "e"));

        // 11. BuiltIn Math

        // Raíz quadrada
        System.out.println(Math.sqrt(9));

        // Potência 3²
        System.out.println(Math.pow(3, 2));

        // Valor absoluto
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));

        // Maior entre dois numeros
        System.out.println(Math.max(10, 99));

    }

}
