package secao5_condicionais;

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

    }

}
