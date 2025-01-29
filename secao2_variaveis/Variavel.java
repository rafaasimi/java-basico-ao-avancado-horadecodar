package secao2_variaveis;

public class Variavel {

    public static void main(String[] args) {

        // 1. O que são variáveis
        // tipo -> nome -> atribuir valor
        String nome = "Rafael";

        // nome -> "Rafael"
        System.out.println(nome);

        // 2. Atribuição de variável com outra
        String teste = "Teste";
        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 999999999999999999L;

        // int numeroGrande2 = numeroGrande;
        System.out.println(numeroGrande);

        // 3. Comentários

        /*
        Comentários em bloco
        Linha 1
        Linha 2
        Linha 3
         */
        /**
         * Comentários de documentação Função para somar números
         *
         * param1: Primeiro número param2: Segundo número return: Retorna a soma
         * dos dois números
         */
        // 4. Strings
        String firstName = "Rafael";
        String lastName = "Simionato";

        System.out.println(firstName + " " + lastName);
        System.out.println("O nome dele é: " + firstName);

        // 5. Char
        char letra = 'A';
        System.out.println(letra);

        char simbolo = '$';
        System.out.println(simbolo);

        char codigoAscii = '\u0041';
        System.out.println(codigoAscii);

    }

}
