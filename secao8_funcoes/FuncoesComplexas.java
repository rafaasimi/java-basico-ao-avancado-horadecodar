package secao8_funcoes;

public class FuncoesComplexas {

    public static void main(String[] args) {

        // 5. Funções com condicionais
        String resultado1 = verificarAcesso(19, false, false);
        System.out.println(resultado1);

        String resultado2 = verificarAcesso(19, true, true);
        System.out.println(resultado2);

        // 6. Funções com switch
        System.out.println(obterDiaDaSemana(5));

        // 7. System.exit
        verificarAutenticacao("teste", "testando");
        verificarAutenticacao("admin", "123");
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

}
