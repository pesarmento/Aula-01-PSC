import java.util.Scanner;

// Exercicio 14

public class ContarPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorPrimos = 0;

        System.out.println("Digite números inteiros positivos (digite um número não positivo para encerrar):");

        while (true) {
            numero = scanner.nextInt(); // Lê o número

            if (numero <= 0) { // Verifica se o número é não positivo
                break; // Encerra o loop se o número for não positivo
            }

            // Verifica se o número é primo
            if (isPrimo(numero)) {
                contadorPrimos++; // Incrementa o contador se o número for primo
            }
        }

        // Imprime a quantidade de números primos
        System.out.println("Quantidade de números primos digitados: " + contadorPrimos);
        scanner.close();
    }

    // Método para verificar se um número é primo
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Encontrou um divisor, não é primo
            }
        }
        return true; // É primo
    }
}
