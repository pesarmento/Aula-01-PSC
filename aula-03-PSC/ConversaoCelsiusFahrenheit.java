import java.util.Scanner;

// Exercicio 18

public class ConversaoCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário os limites e o incremento
        System.out.print("Digite o limite inferior em graus Celsius: ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Digite o limite superior em graus Celsius: ");
        int limiteSuperior = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        // Cabeçalho da tabela
        System.out.printf("%-15s %-15s%n", "Celsius", "Fahrenheit");
        System.out.println("----------------------------------");

        // Loop para conversão e impressão
        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32; // Conversão
            System.out.printf("%-15d %-15.2f%n", celsius, fahrenheit); // Impressão formatada
        }

        scanner.close();
    }
}
