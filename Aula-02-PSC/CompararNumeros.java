import java.util.Scanner;

// Exercicio 16

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Verificar se os números são iguais ou diferentes
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }

        scanner.close();
    }
}
