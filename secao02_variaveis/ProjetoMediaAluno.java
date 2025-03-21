package secao02_variaveis;

// Obter o nome do aluno e 3 notas
import java.util.Scanner;

// Exibir mensagem com nom e e média final
// Bônus: Se a nota for maior ou igual a 7, imprimir APROVADO, se não: REPROVADO
public class ProjetoMediaAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("O aluno " + nome + " possuí média " + media + "e foi aprovado.");
        } else {
            System.out.println("O aluno " + nome + " possuí média " + media + "e foi reprovado.");
        }

        scanner.close();

    }

}
