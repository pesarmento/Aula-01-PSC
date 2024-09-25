import java.util.Scanner;

// Exercicio 8

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Verificar e imprimir o maior número
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else {
            System.out.println("O maior número é: " + numero2);
        }

        scanner.close();
    }
}
