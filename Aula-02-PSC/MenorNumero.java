import java.util.Scanner;

// Exercicio 17

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Verificar e imprimir o menor número
        if (numero1 < numero2) {
            System.out.println("O menor número é: " + numero1);
        } else {
            System.out.println("O menor número é: " + numero2);
        }

        scanner.close();
    }
}
