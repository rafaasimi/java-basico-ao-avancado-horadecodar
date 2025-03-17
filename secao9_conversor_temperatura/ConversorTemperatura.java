package secao9_conversor_temperatura;

import java.util.Scanner;

public class ConversorTemperatura {

    /**
     * Objetivo: Criar um conversor de Celsius para Fahrenheit e de Fahrenheit para
     * Celsius
     * 
     * Etapas do projeto
     * 
     * 1 - Obter do usuário se ele quer conveter Celsius ou Fahrenheit
     * 2 - Criar duas funções, uma para cada conversão
     * 3 - Obter a temperatura em cada uma das funções escolhidas
     * 4 - Exibir uma mensagem com a temperatura, ex: De x C para y F
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você gostaria de converter Celsius para Fahrenheit (1) ou Fahrenheit para Celsius (2)?");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                converterCelsiusParaFahrenheit(celsius);
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                converterFahrenheitParaCelsius(fahrenheit);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }

    public static void converterCelsiusParaFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("A temperatura de %.2fºC (Celcius) é de %.2fF (Fahrenheit)", celsius, fahrenheit);
    }

    public static void converterFahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("A temperatura de %.2fF (Fahrenheit) é de %.2fºC (Celcius)", fahrenheit, celsius);
    }

}
