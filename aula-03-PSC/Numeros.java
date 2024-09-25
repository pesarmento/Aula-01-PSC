import java.util.Scanner;

// Exercicio 23

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de números pares a serem impressos
        System.out.print("Digite quantos números pares deseja imprimir: ");
        int quantidade = scanner.nextInt();

        System.out.println("Números pares:");

        // Loop para imprimir os números pares a partir de 2
        for (int i = 1; i <= quantidade; i++) {
            int par = i * 2; // Calcula o número par
            System.out.print(par + " "); // Imprime o número par atual
        }

        System.out.println(); // Nova linha após a impressão
        scanner.close();
    }
}
