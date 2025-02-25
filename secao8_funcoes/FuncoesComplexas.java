package secao8_funcoes;

public class FuncoesComplexas {

    public static void main(String[] args) {

        // 5. Funções com condicionais
        String resultado1 = verificarAcesso(19, false, false);
        System.out.println(resultado1);

        String resultado2 = verificarAcesso(19, true, true);
        System.out.println(resultado2);
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

}
