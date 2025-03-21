// Ter três produtos catalogados => Nome
// Pedir o nome do produto => Novo ou de um ja existente
// Verificar se o produto está catalogado
// Se sim, podemos escolher alterar o preço ou não
// Se alterar o preco, exibir classificação (Abaixo)
// Se não alterar, Encerrar programa
// Se não, pedir o preço do produto
// Exibir classificação
// Classificações: preco < 50 = barato, 50 a 100 = moderado, maior que 100 = caro
// Exibir no fim nome do produto e preço
package secao07_classificacao_produto;

import java.util.Scanner;

public class ClassificacaoProduto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String produto1 = "Teclado";
        String produto2 = "Mouse";
        String produto3 = "Monitor";

        System.out.println("Digite o nome de um produto para ser cadastrado: ");
        String novoProduto = scanner.nextLine();

        double valorProduto;

        if (novoProduto.equalsIgnoreCase(produto1) || novoProduto.equalsIgnoreCase(produto2) || novoProduto.equalsIgnoreCase(produto3)) {

            System.out.println("Esse produto já existe. Você deseja alterar o preço? (sim/nao)");
            String alterarPreco = scanner.nextLine();

            if (alterarPreco.equalsIgnoreCase("sim")) {

                System.out.println("Digite o novo valor do produto: ");
                valorProduto = scanner.nextDouble();

            } else {
                System.out.println("Preço não atualizado, encerrando programa.");
                scanner.close();
                return;
            }

        } else {
            System.out.println("Digite o valor do produto: ");
            valorProduto = scanner.nextDouble();
        }

        if (valorProduto < 50) {
            System.out.println("Esse produto está barato. Produto: " + novoProduto + " Valor: " + valorProduto);
        } else if (valorProduto >= 50 && valorProduto <= 100) {
            System.out.println("Esse produto está moderado. Produto: " + novoProduto + " Valor: " + valorProduto);
        } else {
            System.out.println("Esse produto está caro. Produto: " + novoProduto + " Valor: " + valorProduto);
        }

        scanner.close();

    }

}
