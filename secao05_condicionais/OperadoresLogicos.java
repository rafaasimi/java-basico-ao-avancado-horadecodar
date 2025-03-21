package secao05_condicionais;

public class OperadoresLogicos {

    public static void main(String[] args) {

        // 8. AND
        int idade = 18;
        boolean possuiCNH = true;

        System.out.println(idade >= 18 && possuiCNH);

        if (idade >= 18 && possuiCNH) {
            System.out.println("Pode dirigir!");
        } else {
            System.out.println("Não pode dirigir!");
        }

        // 9. OR
        boolean estaChovendo = true;
        boolean temGuardaChuva = false;

        System.out.println(estaChovendo || temGuardaChuva);

        int idade2 = 16;
        boolean ehMembro = true;

        // Usuário pode participar do clube
        // Precisa ter > 16 anos ou ser membro
        if (idade2 > 16 || ehMembro) {
            System.out.println("Você pode entrar");
        } else {
            System.out.println("Você não pode entrar");
        }

        // 10. NOT
        System.out.println(estaChovendo);
        System.out.println(!estaChovendo);

        System.out.println(estaChovendo || temGuardaChuva);
        System.out.println(!estaChovendo || temGuardaChuva);

    }

}
