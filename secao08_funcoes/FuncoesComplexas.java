package secao08_funcoes;

public class FuncoesComplexas {

    // Escopo global
    static int globalVar = 20;

    public static void main(String[] args) {

        // 5. Funções com condicionais
        String resultado1 = verificarAcesso(19, false, false);
        System.out.println(resultado1);

        String resultado2 = verificarAcesso(19, true, true);
        System.out.println(resultado2);

        // 6. Funções com switch
        System.out.println(obterDiaDaSemana(5));

        // 7. System.exit
        // verificarAutenticacao("teste", "testando");
        verificarAutenticacao("admin", "123");

        // 8. Documentação
        System.out.println(calcularMedia(5, 6, 7));

        // 9. Escopos
        // Escopo local
        int localVar = 10;

        if(true) {
            System.out.println(localVar);
        }

        System.out.println(globalVar);

        escopoLocal();
    }

    public static String verificarAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo) {

        if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
            return "Acesso permitido: Todos critérios atendidos.";
        } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
            return "Acesso negado. Histório negativo.";
        } else {
            return "Acesso negado. Critérios não atendidos.";
        }

    }

    public static String obterDiaDaSemana(int dia) {

        switch (dia) {
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Dia da semana inválido.";
        }

    }

    public static void verificarAutenticacao(String usuario, String senha) {

        if (!usuario.equals("admin") && !senha.equals("123")) {
            System.out.println("Acesso negado.");
            System.exit(1);
        }

        System.out.println("Acesso permitido.");

    }

    /**
     * Calcula a média de três números inteiros
     * @param nota1 Primeira nota a ser enviada
     * @param nota2 Segunda nota a ser enviada
     * @param nota3 Terceira nota a ser enviada
     * @return A média dos três números
     */
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return nota1 + nota2 + nota3 / 3;
    }

    public static void escopoLocal() {
        System.out.println(globalVar);
    }

}
