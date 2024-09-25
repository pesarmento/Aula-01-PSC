import java.util.Scanner;

// Exercicio 5

public class VerificaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificar se o número está entre 20 e 90
        if (numero >= 20 && numero <= 90) {
            System.out.println("O número " + numero + " está entre 20 e 90.");
        } else {
            System.out.println("O número " + numero + " não está entre 20 e 90.");
        }

        scanner.close();
    }
}
