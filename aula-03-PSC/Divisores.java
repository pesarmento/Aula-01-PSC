import java.util.Scanner;

// Exercicio 10

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite vários números (digite -999 para encerrar):");

        while (true) {
            numero = scanner.nextInt(); // Lê o número

            if (numero == -999) { // Verifica se o número é -999
                break; // Sai do loop se o número for -999
            }

            System.out.println("Divisores de " + numero + ":");
            // Calcula e imprime os divisores
            for (int i = 1; i <= Math.abs(numero); i++) {
                if (numero % i == 0) {
                    System.out.println(i); // Imprime o divisor
                }
            }
        }

        scanner.close();
    }
}
