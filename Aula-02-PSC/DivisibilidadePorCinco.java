import java.util.Scanner;

// Exercicio 10

public class DivisibilidadePorCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificar se é divisível por 5
        if (numero % 5 == 0) {
            System.out.println("O número " + numero + " é divisível por 5.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 5.");
        }

        scanner.close();
    }
}
