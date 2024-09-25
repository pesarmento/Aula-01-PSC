import java.util.Scanner;

// Exercicio 22

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o limite superior ao usuário
        System.out.print("Digite o limite superior: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Números ímpares menores que " + limiteSuperior + ":");

        // Loop para imprimir os números ímpares
        for (int i = 1; i < limiteSuperior; i += 2) {
            System.out.print(i + " "); // Imprime o número ímpar atual
        }

        System.out.println(); // Nova linha após a impressão
        scanner.close();
    }
}
