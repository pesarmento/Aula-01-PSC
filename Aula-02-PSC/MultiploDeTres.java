import java.util.Scanner;

// Exercicio 9

public class MultiploDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificar se é múltiplo de 3
        if (numero % 3 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 3.");
        } else {
            System.out.println("O número " + numero + " não é múltiplo de 3.");
        }

        scanner.close();
    }
}
