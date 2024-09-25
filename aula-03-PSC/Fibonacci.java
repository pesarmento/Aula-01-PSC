import java.util.Scanner;

// Exercicio 16

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int limite = scanner.nextInt();

        int a = 0, b = 1; // Inicializa os dois primeiros números da sequência

        System.out.println("Sequência de Fibonacci até " + limite + ":");

        // Imprime os números da sequência de Fibonacci até o limite
        while (a <= limite) {
            System.out.print(a + " "); // Imprime o número atual
            int proximo = a + b; // Calcula o próximo número na sequência
            a = b; // Atualiza a para o próximo número
            b = proximo; // Atualiza b para o próximo número
        }

        System.out.println(); // Nova linha após a sequência
        scanner.close();
    }
}
