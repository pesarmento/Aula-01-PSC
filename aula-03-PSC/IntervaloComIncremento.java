import java.util.Scanner;

// Exercicio 20

public class IntervaloComIncremento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o limite superior e o incremento ao usuário
        System.out.print("Digite o limite superior: ");
        int limiteSuperior = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        System.out.println("Números do intervalo:");

        // Loop para imprimir os números do intervalo
        for (int i = 0; i <= limiteSuperior; i += incremento) {
            System.out.print(i + " "); // Imprime o número atual
        }

        System.out.println(); // Nova linha após a impressão
        scanner.close();
    }
}
