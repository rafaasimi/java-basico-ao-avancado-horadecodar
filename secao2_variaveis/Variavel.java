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

        // 6. Int
        int idade = 28;
        System.out.println(idade);
        System.out.println(idade + 2);
        System.out.println(idade / 3);

        // 7. Long
        // L: Para forçar a criação da váriavel como long
        // _: Para deixar mais legivel a leitura do número
        long populacaoMundial = 8_000_000_000L;
        System.out.println(populacaoMundial + 1);

        // 8. Double
        double preco = 19.99;
        System.out.println(preco);
        System.out.println(preco * 0.9);

        double pi = 3.141_592_123;
        System.out.println(pi);

        double valorComD = 12.1D;
        System.out.println(valorComD);
    }

}
