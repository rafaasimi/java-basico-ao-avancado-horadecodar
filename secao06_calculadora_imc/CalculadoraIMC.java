// 1 - Pedir peso em kg
// 2 - Pedir altura em m
// 3 - Calcular IMC => peso / (altura * altura)
// 4 - Exibir classificação
// < 18.5 => Abaixo do peso
// >= 18.5 e <= 24.9 => Peso normal
// >= 25 e < 29.9 => Sobrepeso
// Mais que isso: obesidade
package secao06_calculadora_imc;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso em kilos (kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura em metros (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("Abaixo do peso. IMC: %.2f", imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Peso normal. IMC: %.2f", imc);
        } else if (imc >= 25 && imc < 29.9) {
            System.out.printf("Sobrepeso. IMC: %.2f", imc);
        } else {
            System.out.printf("Obesidade. IMC: %.2f", imc);
        }

        scanner.close();

    }

}
