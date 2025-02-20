package secao5_condicionais;

public class Switch {

    public static void main(String[] args) {

        // 11. Switch Case e Break
        // Avaliar o dia de semana baseado no numero
        // 1 = Domingo
        // 7 = Sabado
        int diaDaSemana = 1;

        switch (diaDaSemana) {
            case 1 ->
                System.out.println("Domingo");
            case 2 ->
                System.out.println("Segunda");
            case 3 ->
                System.out.println("Terça");
            case 4 ->
                System.out.println("Quarta");
            case 5 ->
                System.out.println("Quinta");
            case 6 ->
                System.out.println("Sexta");
            case 7 ->
                System.out.println("Sábado");
        }

        //   switch (diaDaSemana) {
        //     case 1:
        //         System.out.println("Domingo");
        //         break;
        //     case 2:
        //         System.out.println("Segunda");
        //         break;
        //     case 3:
        //         System.out.println("Terça");
        //         break;
        //     case 4:
        //         System.out.println("Quarta");
        //         break;
        //     case 5:
        //         System.out.println("Quinta");
        //         break;
        //     case 6:
        //         System.out.println("Sexta");
        //         break;
        //     case 7:
        //         System.out.println("Sábado");
        //         break;
        //     default:
        //         throw new AssertionError();
        // }
    }

}
